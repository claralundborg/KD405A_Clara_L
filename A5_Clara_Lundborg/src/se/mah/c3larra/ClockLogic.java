package se.mah.c3larra;

import java.text.DecimalFormat;
import java.util.Calendar;

public class ClockLogic {
	
	private ClockLogic clockLogic;
	private int alarmHour;
	private int alarmMinutes;
	private DigitalClockGUI digClockGUI;

	//Konstruktor
	public ClockLogic (DigitalClockGUI digitalClockGUI){
		this.digClockGUI = digitalClockGUI;
		ClockThread ca = new ClockThread();
		ca.start();
	}
	
	//Metoder
	public void setAlarm(int hour, int minutes){			
			this.alarmHour = hour;
			this.alarmMinutes = minutes;
	}
	
	public void clearAlarm(){
		setAlarm(-1, -1);
		digClockGUI.activateAlarm(false);
		
	}
	
	/*public int alarmTime() {
		return alarmTime;
	}*/
	
	private class ClockThread extends Thread{
		@Override
		public void run() {
			DecimalFormat df = new DecimalFormat("00");
			
			while(true){
				
				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					e.printStackTrace();
					
					return;
				}
				
				Calendar c = Calendar.getInstance();
				int hour = c.get(Calendar.HOUR_OF_DAY);
				int min = c.get(Calendar.MINUTE);
				int second = c.get(Calendar.SECOND);

				String time = (df.format(hour) + " : "+ df.format(min) + " : " + df.format(second));
				System.out.println(time);
				
				digClockGUI.setTimeOnLabel(time);
				
				if((hour == alarmHour && min == alarmMinutes)) {
					digClockGUI.activateAlarm(true);
					System.out.println("hellu");
				} else {
					digClockGUI.activateAlarm(false);
					System.out.println("nope");
				}
				
			
			}
	
	
		
	}
	}
}
