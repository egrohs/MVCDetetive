//Source file: C:\\DOCUMENTS AND SETTINGS\\ESTIVADOR\\DESKTOP\\Rose\\detetive\\Model\\Game.java

package detetive.model;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

import detetive.model.rmi.RemoteObservable;
import detetive.model.rmi.RemoteObserver;
import detetive.model.rmi.RemoteServerInterface;

/**
 * @author Estivador
 */
public class Server extends RemoteObservable implements RemoteServerInterface {
	private static final long serialVersionUID = 1L;

	private Game game;

	public Server(int nPlayers) throws RemoteException {
		game = new Game(nPlayers);
		try {
			Naming.rebind("GameServer", this);
		} catch (RemoteException re) {
			re.printStackTrace();
		} catch (MalformedURLException mfe) {
			mfe.printStackTrace();
		}
	}

	public int login(Player player) throws RemoteException {
		System.out.println("foi!");
		if (game.getPlayers().size() < game.getNPlayers()) {
			if (game.isFree(player.getCharacter()) == true) {
				int i;
				for (i = 0; i < game.getPlayers().size(); i++) {
					Player pl = (Player) game.getPlayers().get(i);
					if (pl.getCharacter() > player.getCharacter()) {
						break;
					}
				}
				if (i == game.getPlayers().size()) {// add ordered
					game.getPlayers().add(player);
				} else {
					game.getPlayers().add(i, player);
				}

				notifyObservers(game);// someone connect

				// broadcast("receiveConnections");
				/*
				 * for (Iterator iter = game.getPlayers().iterator();
				 * iter.hasNext();) { RMIGameInterface gi = (RMIGameInterface)
				 * ((Player) iter .next()).getGi(); gi.receivePlayers(players); }
				 */
			} else {
				return 0;// character already choosed
			}

			if (game.getPlayers().size() == game.getNPlayers()) {// gamebegins
				game.beginGame();
				notifyObservers(game);
			}
		} else {
			return -1; // game is full
		}
		return game.getNPlayers();
	}

	public void registraObservador(RemoteObserver controler)
			throws RemoteException {
		addObserver(controler);
		System.out.println("Achou!");
	}

	public void setState(GameState gameState) {
		// TODO Auto-generated method stub
		// this=game;
		notifyObservers(gameState);
	}

	public void playSound(String sound) throws RemoteException {
		// TODO Auto-generated method stub
		notifyObservers(sound);
	}

	public void playDices() throws RemoteException {
		// TODO arrumar
		// notifyObservers(new Integer(dice));
	}
}
