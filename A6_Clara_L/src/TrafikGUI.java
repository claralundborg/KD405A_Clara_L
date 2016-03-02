import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TrafikGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textSearch;
	private JTextField textTo;
	private JTextField textFrom;
	
	private JTextArea result;

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
				
				result.setText("Söker..");
				new StationThread().start();
				
			}
		});
		btnSearch.setBounds(222, 23, 117, 29);
		contentPane.add(btnSearch);
		
		JTextArea result = new JTextArea();
		result.setBounds(27, 61, 312, 78);
		contentPane.add(result);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 151, 312, 44);
		contentPane.add(panel);
		
		textFrom = new JTextField();
		textFrom.setColumns(10);
		panel.add(textFrom);
		
		textTo = new JTextField();
		panel.add(textTo);
		textTo.setColumns(10);
		
		JTextArea journeyResult = new JTextArea();
		journeyResult.setBounds(27, 238, 312, 157);
		contentPane.add(journeyResult);
		
		JButton btnSk = new JButton("Sök");
		btnSk.setBounds(131, 197, 117, 29);
		contentPane.add(btnSk);
	}
}
