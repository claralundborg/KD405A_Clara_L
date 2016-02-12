package se.mah.c3larra;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class BikeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textColor;
	private JTextField textSize;
	private JTextField textPrice;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeGUI frame = new BikeGUI();
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
	public BikeGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(19, 6, 220, 266);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BikeStore.addBike(textColor.getText(),Integer.parseInt(textSize.getText()), Integer.parseInt(textPrice.getText()));
				textArea.setText(BikeStore.getAllBikes());
				textColor.setText("");
				textSize.setText("");
				textPrice.setText("");
			}
		});
		
		btnNewButton.setBounds(281, 213, 117, 29);
		contentPane.add(btnNewButton);
		
		textColor = new JTextField();
		textColor.setBounds(281, 30, 130, 26);
		contentPane.add(textColor);
		textColor.setColumns(10);
		
		textSize = new JTextField();
		textSize.setBounds(281, 93, 130, 26);
		contentPane.add(textSize);
		textSize.setColumns(10);
		
		textPrice = new JTextField();
		textPrice.setBounds(281, 158, 130, 26);
		contentPane.add(textPrice);
		textPrice.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Color");
		lblNewLabel.setBounds(289, 17, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(289, 76, 61, 16);
		contentPane.add(lblSize);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(289, 143, 61, 16);
		contentPane.add(lblPrice);
	}
}
