package se.mah.c3larra;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class AnimalGUI extends JFrame {
	
	public ArrayList<Animal> allAnimals = new ArrayList<Animal>();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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
	public AnimalGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 463, 275);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		
		Animal Cat1 = new Cat("lynx", 6, 9);
		allAnimals.add(Cat1);
		Animal Cat2 = new Cat("lynxlynx", 6, 9);
		allAnimals.add(Cat2);
		Animal Dog1 = new Dog("dogomium", 8, true, "Bosse");
		allAnimals.add(Dog1);
		Animal Dog2 = new Dog("hundomium", 8, false);
		allAnimals.add(Dog2);
		Animal Snake1 = new Snake("ormares", true);
		allAnimals.add(Snake1);
		Animal Snake2 = new Snake("nagini", false);
		allAnimals.add(Snake2);
		
		
		for (Animal animals : allAnimals) {
			System.out.println(animals.getInfo());
			textArea.append(animals.getInfo());
		}
	}
	

	

}
