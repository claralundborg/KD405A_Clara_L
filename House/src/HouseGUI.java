import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.util.Random;

public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private House[] myHouses;
	
	private ArrayList<House> houseList = new ArrayList<House>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 18, 410, 239);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		House myHouse1 = new House(2015, 1100);
		House myHouse2 = new House(1995, 30);
		House myHouse3 = new House(1850, 50);
		
		System.out.println("House1 is built in " + myHouse1.getYearBuilt() + " and is " + myHouse1.getSize() + "m2 big.");
		System.out.println("House2 is built in " + myHouse2.getYearBuilt() + " and is " + myHouse2.getSize() + "m2 big.");
		System.out.println("House3 is built in " + myHouse3.getYearBuilt() + " and is " + myHouse3.getSize() + "m2 big.");
		
		textArea.append("\n" + "Uppgift 1.2" + "\n");
		textArea.append("House1 is built in " + myHouse1.getYearBuilt() + " and is " + myHouse1.getSize() + "m2 big. " + "\n");
		textArea.append("House2 is built in " + myHouse2.getYearBuilt() + " and is " + myHouse2.getSize() + "m2 big. " + "\n");
		textArea.append("House3 is built in " + myHouse3.getYearBuilt() + " and is " + myHouse3.getSize() + "m2 big. " + "\n");
		textArea.append("\n" + "Uppgift 1.3" + "\n");

		myHouses = new House[10];
		
		myHouses[0] = new House(1900, 20);
		myHouses[1] = new House(1920, 30);
		myHouses[2] = new House(1940, 40);
		myHouses[3] = new House(1960, 50);
		myHouses[4] = new House(1980, 60);
		myHouses[5] = new House(1990, 70);
		myHouses[6] = new House(2000, 80);
		myHouses[7] = new House(2010, 100);
		myHouses[8] = new House(2011, 110);
		myHouses[9] = new House(2015, 120);
	
		for(int houseNumber = 0; houseNumber < 10; houseNumber = houseNumber+1){
			textArea.append("House " + (houseNumber+1) +" is built: " + myHouses[houseNumber].getYearBuilt() + " and is " + myHouses[houseNumber].getSize() + " m2 big. " + "\n");
		}
		
		textArea.append("\n" + "Uppgift 1.4" + "\n");
		
		Random rand = new Random();
		
		for(int i = 0; i < 100; i++){
			
			int size = rand.nextInt(990) + 10;
			int yearBuilt = rand.nextInt(215) + 1800;
			
			houseList.add(new House(yearBuilt, size));			
		}
		
		for(House house: houseList){
			textArea.append("The house is built in " + house.getYearBuilt() + " and is " + house.getSize() + "m2 big." + "\n");
		}
	}

}
