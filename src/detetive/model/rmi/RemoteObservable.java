package detetive.model.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class RemoteObservable extends UnicastRemoteObject {
	private static final long serialVersionUID = 1L;

	private List observerList = new ArrayList();

	public RemoteObservable() throws java.rmi.RemoteException {
		super();
	}

	public void addObserver(RemoteObserver observer) {
		System.err.println("Adding observer " + observer);
		observerList.add(observer);
	}

	public void notifyObservers(Object arg) {
		System.err.println("Notifying observers");
		RemoteCountMonitor countMonitor;
		try {
			countMonitor = new RemoteCountMonitor(observerList.size());
		} catch (RemoteException e) {
			// This shouldn't happen. Panic
			countMonitor = null;
			System.err.println("Unexpected failure to create object");
			e.printStackTrace(System.err);
			System.exit(1);
		}
		for (int i = 0, sz = observerList.size(); i < sz; ++i) {
			RemoteObserver observer = (RemoteObserver) observerList.get(i);
			try {
				System.err.println("Observer " + i + " notified...");
				observer
						.update((RemoteCountMonitorInterface) countMonitor, arg);
				System.err.println("...ok");
			} catch (RemoteException e) {
				// If call to update fails, we'll assume that
				// the remote observer did not get the message and decrement
				// the counter
				System.err.println("...unsuccessfully");
				e.printStackTrace(System.err);
				countMonitor.decrement();
			}
		}
		countMonitor.waitForZero();
	}
}

class RemoteCountMonitor extends UnicastRemoteObject implements
		RemoteCountMonitorInterface {
	private int count;

	RemoteCountMonitor(int start) throws RemoteException {
		super();
		count = start;
	}

	public synchronized void decrement() {
		count -= 1;
		if (count == 0)
			notify();
	}

	synchronized void waitForZero() {
		if (count > 0)
			try {
				wait();
			} catch (InterruptedException e) {
			}
	}
}
