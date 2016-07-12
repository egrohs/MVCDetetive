package detetive.controler;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

import detetive.model.GameState;
import detetive.model.Server;
import detetive.model.rmi.RemoteCountMonitorInterface;
import detetive.model.rmi.RemoteObserver;
import detetive.model.rmi.RemoteServerInterface;
import detetive.view.VGUI;

public class CGUI extends UnicastRemoteObject implements RemoteObserver {
	private static final long serialVersionUID = 1L;

	private Server server;

	private VGUI vgui;

	private CNetGame cNetGame;
	
	private RemoteServerInterface gi;
	
	private Random random;

	public CGUI() throws RemoteException {
		random = new Random();
		vgui = new VGUI();
		cNetGame = new CNetGame(this);

		vgui.setNetGameListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				cNetGame.netGame();
			}
		});

		vgui.setBdicesListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				try {
					gi.playSound("rsc/Sounds/dice shake and roll.wav");
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//vgui.TFdice.setText(random.nextInt(11) + 2);
			}
		});

		vgui.setBsuggestListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				/*
				 * vgui.makeSuggestion("Palpite no(a) " +
				 * GameConstants.CARDS[getRoom(server.player.getCharacter())]);
				 */
			}
		});
	}

	public VGUI getVgui() {
		return vgui;
	}

	public Server getServer() {
		return server;
	}

	public void setServer(Server server) {
		this.server = server;
	}

	public void update(RemoteCountMonitorInterface rcmi, Object arg) throws RemoteException {
		// TODO mudar isso, pois pode haver mais de um tipo de String (ex. history, msg)
		//provavelmente soh chamara vgui.setState();
		if (arg instanceof Integer) {
			vgui.setTFdice(((Integer) arg).intValue());
			// vgui.setTFdice(game.getDice());
		} else if(arg instanceof String){
//			 TODO sons vai ser feito na funcao remota playsounds
			File file = new File((String)arg);
			AudioClip audioClip = null;
			try {
				audioClip = Applet.newAudioClip(file.toURL());
			} catch (MalformedURLException e1) {
				e1.printStackTrace();
			}
			audioClip.play();
		} else if(arg instanceof GameState){
			vgui.setState((GameState)arg);
		}
	}

	public void setGi(RemoteServerInterface gi) {
		this.gi = gi;
	}
}
