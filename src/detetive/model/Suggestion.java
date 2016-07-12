package detetive.model;

import java.io.Serializable;

public class Suggestion implements Serializable {
	private static final long serialVersionUID = 1L;

	public String name;

	public int sender;

	public int character, weapon, room;

	public Suggestion(int sender, int character, int weapon, int room) {
		this.sender = sender;
		this.character = character;
		this.weapon = weapon;
		this.room = room;
	}
}
