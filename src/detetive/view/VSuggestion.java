//Source file: C:\\DOCUMENTS AND SETTINGS\\ESTIVADOR\\DESKTOP\\Rose\\detetive\\View\\VSuggestion.java

package detetive.view;

import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class VSuggestion extends JDialog {
	private static final long serialVersionUID = 1L;

	private VGUI gui;

	private boolean isAccuse;

	private String title;

	public VSuggestion(Frame parent, String title, boolean isAccuse) {
		super(parent, title, true);
		this.gui = (VGUI) parent;
		this.isAccuse = isAccuse;
		initComponents();
		setVisible(true);
	}

	private void initComponents() {
		Lcharacter = new JLabel();
		CBcharacter = new JComboBox();
		Lweapon = new JLabel();
		CBweapon = new JComboBox();
		Lroom = new JLabel();
		CBroom = new JComboBox();
		Bask = new JButton();
		Bcancel = new JButton();

		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Lcharacter.setText("Personagem");
		getContentPane().add(Lcharacter);

		CBcharacter.setModel(new DefaultComboBoxModel(new String[] {
				"Cel. Mostarda", "Prof. Black", "Dna. Violeta", "Sr. Marinho",
				"Srta. Rosa", "Dna. Branca" }));
		getContentPane().add(CBcharacter);

		Lweapon.setText("Arma");
		getContentPane().add(Lweapon);

		CBweapon.setModel(new DefaultComboBoxModel(new String[] { "Faca",
				"Candelabro", "Revolver", "Corda", "Cano", "Chave Inglesa" }));
		getContentPane().add(CBweapon);

		if (isAccuse) {
			Lroom.setText("Sala");
			getContentPane().add(Lroom);

			CBroom.setModel(new DefaultComboBoxModel(new String[] { "Hall",
					"Sala de Estar", "Cozinha", "Sala de Jantar",
					"Salão de Festas", "Sala de Música", "Salão de Jogos",
					"Biblioteca", "Escritório" }));
			getContentPane().add(CBroom);
			getContentPane().setLayout(new GridLayout(4, 2));
		} else {
			getContentPane().setLayout(new GridLayout(3, 2));
		}

		Bask.setText("Enviar");
		getContentPane().add(Bask);

		Bcancel.setText("Cancelar");
		getContentPane().add(Bcancel);

		pack();
	}

	private JButton Bask;

	private JButton Bcancel;

	private JComboBox CBcharacter;

	private JComboBox CBroom;

	private JComboBox CBweapon;

	private JLabel Lcharacter;

	private JLabel Lroom;

	private JLabel Lweapon;
}
