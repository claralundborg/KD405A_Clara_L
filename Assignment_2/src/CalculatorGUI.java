import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Calculator myCalculator = new Calculator();
		
		textField = new JTextField();
		textField.setBounds(18, 18, 248, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("AC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
				myCalculator.clear();
			}
		});
		btnNewButton.setBounds(18, 76, 60, 46);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("C");
			}
		});
		btnNewButton_1.setBounds(80, 76, 60, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("+");
				myCalculator.plus();
			}
		});
		btnNewButton_3.setBounds(143, 77, 123, 46);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("7");
				myCalculator.numberButtonPressed(7);
			}
		});
		btnNewButton_4.setBounds(18, 125, 60, 46);
		contentPane.add(btnNewButton_4);
		
		JButton button = new JButton("8");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("8");
				myCalculator.numberButtonPressed(8);
			}
		});
		button.setBounds(80, 125, 60, 46);
		contentPane.add(button);
		
		JButton button_1 = new JButton("9");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("9");
				myCalculator.numberButtonPressed(9);
			}
		});
		button_1.setBounds(143, 125, 60, 46);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("–");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("–");
				myCalculator.minus();
			}
		});
		button_2.setBounds(206, 125, 60, 46);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("4");
				myCalculator.numberButtonPressed(4);
			}
		});
		button_3.setBounds(18, 173, 60, 46);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("5");
				myCalculator.numberButtonPressed(5);
			}
		});
		button_4.setBounds(80, 173, 60, 46);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("6");
				myCalculator.numberButtonPressed(6);
			}
		});
		button_5.setBounds(143, 173, 60, 46);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("*");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("*");
				myCalculator.mult();
			}
		});
		button_6.setBounds(206, 171, 60, 46);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("1");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("1");
				myCalculator.numberButtonPressed(1);
			}
		});
		button_7.setBounds(18, 219, 60, 46);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("2");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("2");
				myCalculator.numberButtonPressed(2);
			}
		});
		button_8.setBounds(80, 219, 60, 46);
		contentPane.add(button_8);
		
		JButton btnAc = new JButton("0");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				myCalculator.numberButtonPressed(0);
			}
		});
		btnAc.setBounds(18, 267, 60, 46);
		contentPane.add(btnAc);
		
		JButton button_9 = new JButton("3");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("3");
				myCalculator.numberButtonPressed(3);
			}
		});
		button_9.setBounds(143, 219, 60, 46);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("/");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("/");
			}
		});
		button_10.setBounds(206, 219, 60, 46);
		contentPane.add(button_10);
		
		JButton button_12 = new JButton(".");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(".");
			}
		});
		button_12.setBounds(143, 267, 60, 46);
		contentPane.add(button_12);
		
		JButton button_11 = new JButton("00");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("00");
				myCalculator.numberButtonPressed(00);
			}
		});
		button_11.setBounds(80, 267, 60, 46);
		contentPane.add(button_11);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
			}
		});
		button_13.setBounds(206, 267, 60, 46);
		contentPane.add(button_13);
	}
}
