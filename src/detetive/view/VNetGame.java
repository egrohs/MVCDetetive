//Source file: C:\\DOCUMENTS AND SETTINGS\\ESTIVADOR\\DESKTOP\\Rose\\detetive\\View\\VNetGame.java

package detetive.view;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

public class VNetGame extends JDialog implements Serializable {
	private static final long serialVersionUID = 1L;

	private VGUI gui;

	private JButton Bplay;

	public JComboBox CBpers;

	public JCheckBox ChBserver;

	private JLabel Lip;

	private JLabel Lname;

	private JPanel Pconn;

	private JPanel Peast;

	private JPanel Pname;

	private JPanel Ppers;

	private JPanel Pplayers;

	private JRadioButton RB2;

	private JRadioButton RB3;

	private JRadioButton RB6;

	public JTextField TFIP;

	public JTextField TFname;

	private JTextField TFport;

	public ButtonGroup buttonGroup;

	private JLabel jLabel1;

	private JLabel jLabel2;

	public VNetGame(Frame parent, boolean modal) {
		super(parent, modal);
		gui = (VGUI) parent;
		initComponents();
	}

	private void initComponents() {
		buttonGroup = new ButtonGroup();
		Pconn = new JPanel();
		Lip = new JLabel();
		TFIP = new JTextField();
		jLabel1 = new JLabel();
		TFport = new JTextField();
		ChBserver = new JCheckBox();
		Bplay = new JButton();
		Pname = new JPanel();
		Lname = new JLabel();
		TFname = new JTextField();
		Peast = new JPanel();
		Ppers = new JPanel();
		jLabel2 = new JLabel();
		CBpers = new JComboBox();
		Pplayers = new JPanel();
		RB2 = new JRadioButton();
		RB3 = new JRadioButton();
		RB6 = new JRadioButton();

		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Pconn.setLayout(new GridLayout(3, 2));

		Pconn.setBorder(new TitledBorder("Tipo de Conexão"));
		Lip.setText("IP:");
		Pconn.add(Lip);

		TFIP.setColumns(15);
		TFIP.setText("127.0.0.1");
		Pconn.add(TFIP);

		jLabel1.setText("Porta:");
		Pconn.add(jLabel1);

		TFport.setText("6500");
		Pconn.add(TFport);

		ChBserver.setText("Servidor");

		Pconn.add(ChBserver);

		getContentPane().add(Pconn, BorderLayout.WEST);

		Bplay.setText("Jogar");

		getContentPane().add(Bplay, BorderLayout.SOUTH);

		Lname.setText("Nome:");
		Pname.add(Lname);

		TFname.setColumns(20);
		Pname.add(TFname);

		getContentPane().add(Pname, BorderLayout.NORTH);

		Peast.setLayout(new GridLayout(2, 1));

		jLabel2.setText("Personagem:");
		Ppers.add(jLabel2);

		CBpers.setModel(new DefaultComboBoxModel(new String[] {
				"Cel. Mostarda", "Prof. Black", "Dna. Violeta", "Sr. Marinho",
				"Srta. Rosa", "Dna. Branca" }));

		Ppers.add(CBpers);
		CBpers.getAccessibleContext().setAccessibleDescription("");

		Peast.add(Ppers);

		Pplayers.setBorder(new TitledBorder("Nro de Jogadores"));
		buttonGroup.add(RB2);
		RB2.setSelected(true);
		RB2.setText("2");
		RB2.setEnabled(false);
		Pplayers.add(RB2);

		buttonGroup.add(RB3);
		RB3.setText("3");
		RB3.setEnabled(false);
		Pplayers.add(RB3);

		buttonGroup.add(RB6);
		RB6.setText("6");
		RB6.setEnabled(false);
		Pplayers.add(RB6);

		Peast.add(Pplayers);

		getContentPane().add(Peast, BorderLayout.EAST);

		pack();
	}

	public void setChBserverListener(ActionListener listener) {
		ChBserver.addActionListener(listener);
	}

	public void ChBserverActionPerformed() {
		if (ChBserver.isSelected()) { // is server
			RB2.setEnabled(true);
			RB3.setEnabled(true);
			RB6.setEnabled(true);
			TFIP.setEnabled(false);
		} else {
			RB2.setEnabled(false);
			RB3.setEnabled(false);
			RB6.setEnabled(false);
			TFIP.setEnabled(true);
		}
	}

	public void setBplayListener(ActionListener listener) {
		Bplay.addActionListener(listener);
	}
}
