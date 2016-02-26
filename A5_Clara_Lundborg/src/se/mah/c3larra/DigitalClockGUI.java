package se.mah.c3larra;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldHour;
	private JTextField textFieldMinutes;
	private JLabel lblShowTime;
	private JLabel lblAlarmAt;
	private ClockLogic clockLogic;
	private JLabel lblMessage;
	
	
	/* Launch the application. **/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	/* Create the frame.**/
	
	public DigitalClockGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		/* KLOCKA **/
		
		JLabel lblHour = new JLabel("HOUR");
		lblHour.setBounds(28, 16, 61, 16);
		contentPane.add(lblHour);
		
		JLabel lblMinutes = new JLabel("MINUTES");
		lblMinutes.setBounds(155, 16, 61, 16);
		contentPane.add(lblMinutes);
		
		textFieldHour = new JTextField();
		textFieldHour.setBounds(26, 41, 71, 26);
		contentPane.add(textFieldHour);
		textFieldHour.setColumns(10);
		
		textFieldMinutes = new JTextField();
		textFieldMinutes.setBounds(155, 41, 71, 26);
		contentPane.add(textFieldMinutes);
		textFieldMinutes.setColumns(10);
		
		
		/* BUTTONS **/
		
		JButton btnSetAlarm = new JButton("SET ALARM");
		btnSetAlarm.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				lblAlarmAt.setText(textFieldHour.getText() + ":" + textFieldMinutes.getText());
				
				//int hour;
				//int minutes;
				
				//hour = Integer.parseInt(textFieldHour.getText());
				//minutes = Integer.parseInt(textFieldMinutes.getText());
				
				clockLogic.setAlarm(Integer.parseInt(textFieldHour.getText()), Integer.parseInt(textFieldMinutes.getText()));
				
				textFieldHour.setText("");
				textFieldMinutes.setText("");
				
			}
			
		});
		btnSetAlarm.setBounds(256, 26, 117, 29);
		contentPane.add(btnSetAlarm);
		
		
		JButton btnClear = new JButton("CLEAR ALARM");
		btnClear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			}
			
		});
		btnClear.setBounds(382, 26, 117, 29);
		contentPane.add(btnClear);
		
		/* BUTTONS/ **/
		
		
		lblShowTime = new JLabel("");
		lblShowTime.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblShowTime.setBounds(28, 100, 216, 80);
		contentPane.add(lblShowTime);
		
		JLabel lblAlarmAt2 = new JLabel("Alarm at:");
		lblAlarmAt2.setBounds(301, 100, 61, 26);
		contentPane.add(lblAlarmAt2);
		
		lblAlarmAt = new JLabel("");
		lblAlarmAt.setBounds(374, 100, 102, 26);
		contentPane.add(lblAlarmAt);
		
		lblMessage = new JLabel("");
		lblMessage.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblMessage.setBounds(301, 161, 177, 68);
		contentPane.add(lblMessage);
		
		clockLogic = new ClockLogic(this);
	}
	
	public void setTimeOnLabel(String time){
		lblShowTime.setText(time);
	}
	
	public void setAlarmOnLabel(String alarmTime){
		lblAlarmAt.setText(alarmTime);
	}
	
	public void activateAlarm(boolean activate){
		
		if(activate){
			lblMessage.setText("Wake up!");
				
			}else{
				lblMessage.setText("");
				
			}		
	}

}
