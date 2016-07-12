package detetive.controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Enumeration;
import java.util.Observable;

import javax.swing.JRadioButton;

import detetive.model.Server;
import detetive.model.GameConstants;
import detetive.model.Player;
import detetive.model.rmi.RemoteServerInterface;
import detetive.view.VNetGame;

public class CNetGame implements Serializable {
	private static final long serialVersionUID = 1L;

	private CGUI cgui;

	private VNetGame vNetGame;

	public CNetGame(CGUI cgui) {
		this.cgui = cgui;
	}

	void play() {
		try {
			// TODO Util.getExternalIP() em vez de 127...
			Player player = new Player(vNetGame.TFname.getText(),
					vNetGame.CBpers.getSelectedIndex(), "127.0.0.1");

			if (vNetGame.ChBserver.isSelected()) { // is server
				Enumeration e = vNetGame.buttonGroup.getElements();
				while (e.hasMoreElements()) {
					JRadioButton rb = (JRadioButton) e.nextElement();
					if (rb.isSelected()) {
						cgui.setServer(new Server(Integer.parseInt(rb.getText())));
						break;
					}
				}
			}
			RemoteServerInterface gi = (RemoteServerInterface) Naming.lookup("rmi://"
					+ vNetGame.TFIP.getText() + "/GameServer");
			
			cgui.setGi(gi);

			int nPl = gi.login(player);

			if (nPl == 0) {// character already choosed, takeother!
				vNetGame.setTitle("Personagem "
						+ GameConstants.CARDS[vNetGame.CBpers
								.getSelectedIndex()]
						+ " já foi escolhido, tente outro!");
				return;
			} else if (nPl == -1) {// game is full
				vNetGame.setTitle("Sorry, game is full!");
				return;
			}

			//TODO arrumar, o cara fez login antes de ser registrado!
			gi.registraObservador(cgui);

		} catch (NotBoundException nbe) {
			System.out.println("NotBoundException occurred: " + nbe);
			nbe.printStackTrace();
		} catch (MalformedURLException mfue) {
			System.out.println("MalformedURLException occurred: " + mfue);
			mfue.printStackTrace();
		} catch (RemoteException re) {
			System.out.println("RemoteException occurred: " + re);
			re.printStackTrace();
		}
		vNetGame.dispose();
	}

	public void netGame() {
		vNetGame = new VNetGame(cgui.getVgui(), true);

		vNetGame.setChBserverListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vNetGame.ChBserverActionPerformed();
			}
		});

		vNetGame.setBplayListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				play();
			}
		});

		vNetGame.setVisible(true);
	}

	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	/*public RemoteGameInterface getGi() {
		return gi;
	}*/
}
