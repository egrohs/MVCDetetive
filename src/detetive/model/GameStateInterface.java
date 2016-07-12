package detetive.model;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GameStateInterface extends Remote{
	public void setState(GameState gs) throws RemoteException;
}
