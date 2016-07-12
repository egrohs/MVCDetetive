package detetive.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game extends GameState {
	private static final long serialVersionUID = 1L;

	private BoardManagement mBM;

	private Random random;

	public Game(int nPlayers) {
		super(nPlayers);
		random = new Random();
	}

	public void addPlayer(Player player) {
		players.add(player);
	}

	public boolean isFree(int character) {
		for (Iterator iter = players.iterator(); iter.hasNext();) {
			Player pl = (Player) iter.next();
			if (pl.getCharacter() == character) {
				return false;
			}
		}
		return true;
	}

	public void beginGame() {
		ArrayList deck = new ArrayList(18);
		int rand = random.nextInt(6);

		for (int i = 0; i < 6; i++) { // persons
			if (i != rand)
				deck.add(new Card(i));
			else
				confidential.add(new Card(i));
		}

		rand = random.nextInt(6);
		for (int i = 0; i < 6; i++) { // weapons
			if (i != rand)
				deck.add(new Card(i + 6));
			else
				confidential.add(new Card(i + 6));
		}

		rand = random.nextInt(9);
		for (int i = 0; i < 9; i++) { // rooms
			if (i != rand)
				deck.add(new Card(i + 12));
			else
				confidential.add(new Card(i + 12));
		}

		int nCards = 18 / nPlayers;

		for (Iterator iter = players.iterator(); iter.hasNext();) {
			Player pl = (Player) iter.next();
			ArrayList hand = new ArrayList(nCards);
			for (int i = 0; i < nCards; i++) { // shuffle & draw
				rand = random.nextInt(deck.size());
				hand.add((Card) deck.remove(rand));
			}

			pl.setHand(hand);
		}

		// TODO Miss Scarlet begins!
		rand = random.nextInt(nPlayers);
		//TODO 
		
		/*
		 * RMIGameInterface gi = ((Player) players.get(rand)).getGi(); try {
		 * gi.setTurn(true); } catch (RemoteException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	}

	public List getPlayers() {
		return players;
	}
}
