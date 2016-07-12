package detetive.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GameState implements Serializable {
	private static final long serialVersionUID = 1L;

	protected int nPlayers, dice, undodice, round, turn;

	protected Item items[] = new Item[12];

	protected List confidential, players;

	protected String history;

	public GameState(int nPlayers) {
		this.nPlayers = nPlayers;
		confidential = new ArrayList(3);
		players = new ArrayList();
		round = 0;
	}

	public int getDice() {
		return dice;
	}

	public void setDice(int dice) {
		this.dice = dice;
	}

	public int getUndodice() {
		return undodice;
	}

	public void setUndodice(int undodice) {
		this.undodice = undodice;
	}

	public int getNPlayers() {
		return nPlayers;
	}

	public int getTurn() {
		return turn;
	}
}
