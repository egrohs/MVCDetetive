//Source file: C:\\DOCUMENTS AND SETTINGS\\ESTIVADOR\\DESKTOP\\Rose\\detetive\\Model\\Player.java

package detetive.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Estivador
 */
public class Player implements Serializable{
	private static final long serialVersionUID = 1L;

	private ArrayList hand;

	private String name;

	private int character;

	public Player(String name, int character, String ip){
		this.name = name;
		this.character = character;
	}

	public int getCharacter() {
		return character;
	}
	
	public void setHand(ArrayList hand) {
		this.hand = hand;
	}
}
