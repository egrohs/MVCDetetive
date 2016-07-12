//Source file: C:\\DOCUMENTS AND SETTINGS\\ESTIVADOR\\DESKTOP\\Rose\\detetive\\RMIPlayerInterface.java

package detetive.model.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import detetive.model.Player;

public interface RemoteServerInterface extends Remote {
	public int login(Player player) throws RemoteException;

	public void playSound(String sound) throws RemoteException;

	public void playDices() throws RemoteException;

	// public void receivePlayers(ArrayList players) throws RemoteException;
	// public int getNPlayers() throws RemoteException;
	// public void setTurn(boolean isMyTurn) throws RemoteException;

	public void registraObservador(RemoteObserver controler)
			throws RemoteException;

	//public void setState(GameState gameState) throws RemoteException;
}
