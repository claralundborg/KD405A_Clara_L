package se.mah.c3larra;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class HumanDogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldHuman;
	private JTextField textFieldDog;
	
	Human human1;
	Dog dog1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumanDogGUI frame = new HumanDogGUI();
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
	public HumanDogGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HUMANS & DOGS");
		lblNewLabel.setBounds(161, 21, 114, 16);
		contentPane.add(lblNewLabel);
		
		textFieldHuman = new JTextField();
		textFieldHuman.setBounds(26, 65, 130, 26);
		contentPane.add(textFieldHuman);
		textFieldHuman.setColumns(10);
		
		textFieldDog = new JTextField();
		textFieldDog.setBounds(26, 115, 130, 26);
		contentPane.add(textFieldDog);
		textFieldDog.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 232, 380, 61);
		contentPane.add(scrollPane);
		
		JTextArea textAreaInfo = new JTextArea();
		scrollPane.setViewportView(textAreaInfo);
		textAreaInfo.setEditable(false);
		

		JTextArea textAreaError = new JTextArea();
		textAreaError.setEditable(false);
		textAreaError.setBounds(29, 323, 380, 61);
		contentPane.add(textAreaError);
		
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textFieldHuman.getText().length() < Constants.MIN_LETTERS) {
					textAreaError.setText("Name must be more than 3 letters! ");
				}
				
				human1 = new Human(textFieldHuman.getText());
				textAreaInfo.setText(human1.getName());
				//textFieldHuman.setText("");
				
				//GAMLA
				/* DogStore.addHuman(textFieldHuman.getText());
				textAreaInfo.setText(DogStore.getAllHumans());
				textFieldHuman.setText("");;*/
			}
		});
		btnNewHuman.setBounds(161, 65, 117, 29);
		contentPane.add(btnNewHuman);
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textFieldHuman.getText().isEmpty()) {
					textAreaError.setText("Dog must have an owner! ");
				} else {
					dog1 = new Dog(textFieldDog.getText());
					human1.buyDog(dog1);
					textAreaInfo.setText(dog1.getName());
					textFieldDog.setText("");
				}
				
				//GAMLA
				/*
				DogStore1.addDog(textFieldDog.getText());
				textAreaInfo.setText(DogStore1.getAllDogs());
				textFieldDog.setText("");;
				*/
			}
		});
		btnBuyDog.setBounds(161, 115, 117, 29);
		contentPane.add(btnBuyDog);
		
		JButton btnPrintInfo = new JButton("Print info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textAreaInfo.setText(human1.getInfo(human1.getName()));
				
				//GAMLA
				/*
				DogStore.addHuman(textFieldHuman.getText());
				DogStore1.addDog(textFieldDog.getText());
				textAreaInfo.setText(DogStore.getAllHumans() + DogStore1.getAllDogs());
				*/
			}
		});
		btnPrintInfo.setBounds(161, 164, 117, 29);
		contentPane.add(btnPrintInfo);
		
		
		JLabel lblInfo = new JLabel("INFO");
		lblInfo.setBounds(29, 214, 61, 16);
		contentPane.add(lblInfo);
		
		
		JLabel lblErrorMessage = new JLabel("ERROR MESSAGE");
		lblErrorMessage.setBounds(28, 305, 108, 16);
		contentPane.add(lblErrorMessage);
	}
}
