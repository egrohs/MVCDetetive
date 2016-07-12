package detetive.model.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteObserver extends Remote {
	public void update(RemoteCountMonitorInterface rcmi, Object arg) throws RemoteException;
}
