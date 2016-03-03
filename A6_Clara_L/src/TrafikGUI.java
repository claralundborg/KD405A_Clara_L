import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class TrafikGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textSearch;
	private JTextField textTo;
	private JTextField textFrom;
	
	private JTextArea journeyResult;
	private JTextArea firstResult;
	private JScrollPane scrollPane;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrafikGUI frame = new TrafikGUI();
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
	public TrafikGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textSearch = new JTextField();
		textSearch.setBounds(27, 23, 183, 26);
		contentPane.add(textSearch);
		textSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Sök");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstResult.setText("");
				
				ArrayList<Station> searchStations = new ArrayList<Station>(); 
				searchStations.addAll(Parser.getStationsFromURL(textSearch.getText()));
				for (Station s: searchStations){
					firstResult.append(s.getStationName() +" number:" +s.getStationNbr() + "\n");
				}
			}
		});
		btnSearch.setBounds(222, 23, 117, 29);
		contentPane.add(btnSearch);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 61, 302, 64);
		contentPane.add(scrollPane);
		
		firstResult = new JTextArea();
		scrollPane.setViewportView(firstResult);

		JPanel panel = new JPanel();
		panel.setBounds(27, 151, 312, 44);
		contentPane.add(panel);
		
		textFrom = new JTextField();
		textFrom.setColumns(10);
		panel.add(textFrom);
		
		textTo = new JTextField();
		panel.add(textTo);
		textTo.setColumns(10);
		
		journeyResult = new JTextArea();
		journeyResult.setBounds(27, 238, 312, 157);
		contentPane.add(journeyResult);
		
		JButton btnSk = new JButton("Sök");
		btnSk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				journeyResult.setText("Söker...");

				String searchURL = Constants.getURL(textFrom.getText(), textTo.getText(), 1); //Malm� C = 80000,  Lund C, 81216 Malm� Gatorg 80100, H�ssleholm C 93070
				System.out.println(searchURL);
				System.out.println("// Results when searching:");
			}
		});
		btnSk.setBounds(131, 197, 117, 29);
		contentPane.add(btnSk);
	}
}
