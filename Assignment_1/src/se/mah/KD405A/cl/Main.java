package se.mah.KD405A.cl;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Panel;
import javax.swing.JProgressBar;
import javax.swing.Box;
import java.awt.Canvas;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtJohananJohnsson;
	private JTextField textField_1;
	private JTextField txtJjohnsonhotmailcom;
	private JTextField txtJohannavgen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 359);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(10, 0, 10, 0));
		menuBar.setBackground(new Color(165, 42, 42));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arkiv");
		mnNewMenu.setBackground(new Color(165, 42, 42));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnNewMenu.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnNewMenu.add(mntmAvsluta);
		
		JMenu mnNewMenu_1 = new JMenu("Medlem");
		mnNewMenu_1.setBackground(new Color(165, 42, 42));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnNewMenu_1.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnNewMenu_1.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hjälp");
		mnHjlp.setBackground(new Color(165, 42, 42));
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hjälp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		
		JLabel label = new JLabel("                                              ");
		menuBar.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		menuBar.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("/Users/claralundborg/Documents/Interaktionsdesign/Programmering II/GitHub/KD405A_Clara_L/Assignment_1/bin/images/WorkItLogga2.png"));
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(255, 255, 255)));
		scrollPane.setBounds(8, 28, 189, 233);
		contentPane.add(scrollPane);
		
		JTextArea txtrClara = new JTextArea();
		scrollPane.setViewportView(txtrClara);
		txtrClara.setText("Johanne Radford\nJennifer Larsson\nJohanna Johnsson\nSebastian Nilsson\nMarkus Håkansson\nOskar Hansson\nMadde Wittbom\nSebastian Wiktorin\nHerman Wikner\nAntonia Jungbeck\nFreja Detter\nHarry Styles\nJonatan Holmgren\nJohannes Johansson\nJustin Bieber\nSelena Gomez\nLars Holmberg\nNina Persson\nKim Possible");
		
		JLabel lblMedlemmar = new JLabel("Medlemmar");
		lblMedlemmar.setForeground(new Color(0, 0, 0));
		lblMedlemmar.setBounds(8, 7, 79, 16);
		contentPane.add(lblMedlemmar);
		
		JLabel lblNamn = new JLabel("NAMN");
		lblNamn.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNamn.setBounds(340, 80, 61, 16);
		contentPane.add(lblNamn);
		
		JLabel lblNewLabel_1 = new JLabel("PERSONNUMMER");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(340, 27, 105, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblTelefon = new JLabel("TELEFON");
		lblTelefon.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblTelefon.setBounds(340, 134, 61, 16);
		contentPane.add(lblTelefon);
		
		JLabel lblEmail = new JLabel("E-MAIL");
		lblEmail.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblEmail.setBounds(220, 194, 61, 16);
		contentPane.add(lblEmail);
		
		JLabel lblAdress = new JLabel("ADRESS");
		lblAdress.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblAdress.setBounds(220, 223, 61, 16);
		contentPane.add(lblAdress);
		
		textField = new JTextField();
		textField.setText("9403215678");
		textField.setBounds(340, 42, 172, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtJohananJohnsson = new JTextField();
		txtJohananJohnsson.setText("Johanna Johnson");
		txtJohananJohnsson.setBounds(340, 96, 172, 26);
		contentPane.add(txtJohananJohnsson);
		txtJohananJohnsson.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("0709812345");
		textField_1.setBounds(340, 149, 172, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtJjohnsonhotmailcom = new JTextField();
		txtJjohnsonhotmailcom.setText("j.johnson@hotmail.com");
		txtJjohnsonhotmailcom.setBounds(268, 188, 244, 26);
		contentPane.add(txtJjohnsonhotmailcom);
		txtJjohnsonhotmailcom.setColumns(10);
		
		txtJohannavgen = new JTextField();
		txtJohannavgen.setText("Johannavägen 94, 21211, Malmö");
		txtJohannavgen.setBounds(268, 217, 244, 26);
		contentPane.add(txtJohannavgen);
		txtJohannavgen.setColumns(10);
		
		JButton btnSpara = new JButton("SPARA");
		btnSpara.setBounds(305, 249, 117, 29);
		contentPane.add(btnSpara);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/claralundborg/Documents/Interaktionsdesign/Programmering II/GitHub/KD405A_Clara_L/Assignment_1/bin/images/Johanna.jpg"));
		lblNewLabel_2.setBounds(209, 28, 128, 155);
		contentPane.add(lblNewLabel_2);
	}
}
