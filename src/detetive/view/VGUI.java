//Source file: C:\\DOCUMENTS AND SETTINGS\\ESTIVADOR\\DESKTOP\\Rose\\detetive\\View\\VGUI.java

package detetive.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import detetive.model.GameState;
import detetive.model.GameStateInterface;

public class VGUI extends JFrame implements Serializable, GameStateInterface {
	private static final long serialVersionUID = 1L;

	private JButton Baccuse;

	private JPanel Pportrait;

	private JLabel Lportrait;

	private JButton Bhand;

	private JButton Bdices;

	private JButton Bsuggest;

	private JButton Bsecret;

	private JButton Bsend;

	private JButton Bturn;

	private JPanel Pbuttons;

	private JButton Bundo;

	private JTabbedPane JTP;

	private JLabel LMsg;

	private ImageIcon Iboard, Ibloco;

	private JLabel Lboard;

	private JLabel Lnotes;

	private JPanel PBatePapo;

	private JPanel Pmenu;

	private JPanel PJogo;

	private JTextArea TAMsgs;

	private JTextArea TAHistory;

	private JTextField TFMsg;

	private JMenu jMenu1;

	private JMenu jMenu2;

	private JMenuBar jMenuBar;

	private JMenuItem jMenuItem1;

	private JMenuItem jMenuItem2;

	private JMenuItem jMenuItem3;

	private JMenuItem jMenuItem4;

	private JPanel jPanel;

	private JSeparator jSeparator1;

	public JTextField TFdice;

	public VGUI() {
		initComponents();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension = toolkit.getScreenSize();
		this.setSize(dimension);

		setVisible(true);
	}

	private void initComponents() {
		JTP = new JTabbedPane();
		PJogo = new JPanel();
		Pmenu = new JPanel();
		Pmenu.setLayout(new GridLayout(2, 1));
		Iboard = new ImageIcon("rsc/Images/Board.jpg");
		Lboard = new JLabel(Iboard);
		Ibloco = new ImageIcon("rsc/Images/Bloco.jpg");
		Lnotes = new JLabel(Ibloco);
		PBatePapo = new JPanel();
		TAMsgs = new JTextArea();
		jPanel = new JPanel();
		LMsg = new JLabel();
		TFMsg = new JTextField();
		Bsend = new JButton();
		TAHistory = new JTextArea();
		jMenuBar = new JMenuBar();
		jMenu1 = new JMenu();
		jMenuItem1 = new JMenuItem();
		jMenuItem2 = new JMenuItem();
		jSeparator1 = new JSeparator();
		jMenuItem3 = new JMenuItem();
		jMenu2 = new JMenu();
		jMenuItem4 = new JMenuItem();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Detetive");
		this.setExtendedState(Frame.MAXIMIZED_BOTH);
		this.setResizable(false);
		JTP.setName("");
		PJogo.setLayout(new BorderLayout());
		{
			Pbuttons = new JPanel();
			Pmenu.add(Pbuttons);
			Pbuttons.setLayout(new GridLayout(8, 1));
			{
				Bdices = new JButton();
				Pbuttons.add(Bdices);
				Bdices.setText("Jogar Dados");
				Bdices.setEnabled(false);

				Bsecret = new JButton();
				Pbuttons.add(Bsecret);
				Bsecret.setText("P. Secreta");
				Bsecret.setEnabled(false);

				Bundo = new JButton();
				Pbuttons.add(Bundo);
				Bundo.setText("Voltar");
				Bundo.setEnabled(false);

				Bsuggest = new JButton();
				Pbuttons.add(Bsuggest);
				Bsuggest.setText("Palpite");
				Bsuggest.setEnabled(false);

				Baccuse = new JButton();
				Pbuttons.add(Baccuse);
				Baccuse.setText("Acusação");
				Baccuse.setEnabled(false);

				Bhand = new JButton();
				Pbuttons.add(Bhand);
				Bhand.setText("Cartas");
				Bhand.setEnabled(false);

				Bturn = new JButton();
				Pbuttons.add(Bturn);
				Bturn.setText("Passar a Vez");
				Bturn.setEnabled(false);

				TFdice = new JTextField();
				Pbuttons.add(TFdice);
				TFdice.setColumns(2);
				TFdice.setEditable(false);
				TFdice.setText("0");
			}
		}
		{
			Pportrait = new JPanel();
			Pmenu.add(Pportrait);
			{
				Lportrait = new JLabel();
				Pportrait.add(Lportrait);
				Lportrait.setSize(136, 284);
			}
		}

		PJogo.add(Pmenu, BorderLayout.WEST);

		// usar refletion?
		// TODO inicializar items
		/*
		 * for (int i = 0; i < 6; i++) { // characters´s initial position
		 * items[i] = new Item(i, Game.characters[i][0], Game.characters[i][1]);
		 * Lboard.add(items[i], BorderLayout.CENTER); items[i].setBounds(xoffset +
		 * Game.characters[i][1] * edge, yoffset + Game.characters[i][0] * edge,
		 * 20, 20); } for (int i = 0; i < 6; i++) { // weapons´s initial
		 * position items[i + 6] = new Item(i + 6, Game.weapons[i][0],
		 * Game.weapons[i][1]); Lboard.add(items[i + 6], BorderLayout.CENTER);
		 * items[i + 6].setBounds(xoffset + Game.weapons[i][1] * edge, yoffset +
		 * Game.weapons[i][0] * edge, 20, 20); }
		 */

		PJogo.add(Lboard, BorderLayout.CENTER);

		Lboard.setHorizontalAlignment(SwingConstants.LEFT);
		Lboard.setVerticalAlignment(SwingConstants.TOP);

		PJogo.add(Lnotes, BorderLayout.EAST);

		PJogo.setBackground(Color.GREEN.darker());
		JTP.addTab("Jogo", PJogo);

		PBatePapo.setLayout(new BorderLayout());

		PBatePapo.add(TAMsgs, BorderLayout.CENTER);

		LMsg.setText("Mensagem:");
		jPanel.add(LMsg);

		TFMsg.setColumns(30);
		jPanel.add(TFMsg);

		Bsend.setText("Enviar");

		jPanel.add(Bsend);

		PBatePapo.add(jPanel, BorderLayout.SOUTH);

		JTP.addTab("Bate Papo", PBatePapo);

		JTP.addTab("Resumo", TAHistory);

		getContentPane().add(JTP, BorderLayout.CENTER);

		jMenu1.setText("Opções");
		jMenuItem1.setText("Jogo Individual");
		jMenuItem1.setEnabled(false);
		jMenu1.add(jMenuItem1);

		jMenuItem2.setText("Jogo em Rede");

		jMenu1.add(jMenuItem2);

		jMenu1.add(jSeparator1);

		jMenuItem3.setText("Sair");
		jMenu1.add(jMenuItem3);

		jMenuBar.add(jMenu1);

		jMenu2.setText("Ajuda");
		jMenuItem4.setText("Sobre");
		jMenu2.add(jMenuItem4);

		jMenuBar.add(jMenu2);

		setJMenuBar(jMenuBar);

		pack();
		setVisible(true);
	}

	public void setNetGameListener(ActionListener listener) {
		jMenuItem2.addActionListener(listener);
	}

	public void setBdicesListener(ActionListener listener) {
		Bdices.addActionListener(listener);
	}

	public void setBsuggestListener(ActionListener listener) {
		Bsuggest.addActionListener(listener);
	}

	public void netGame() {
		// vNetGame = new VNetGame(this, true);
	}

	public void setTFdice(int dice) {
		TFdice.setText("" + dice);
	}

	public void makeSuggestion(String title) {
		// TODO completar o titulos com a sala
		// vSuggestion = new VSuggestion(this, title, false);
	}

	public void setState(GameState gs) {
		//TODO atualizar a posicao dos items
		//TODO atualizar o history
		
		//if(gs.getTurn()==)//is my turn
		Bdices.setEnabled(true);
		Baccuse.setEnabled(true);
		Bturn.setEnabled(true);
	}
}
