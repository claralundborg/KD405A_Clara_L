package se.mah.c3larra;

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
		
		
	}
	
	public int getHour() {
		return alarmHour;
	}
	
	private class ClockThread extends Thread{
		@Override
		public void run() {
			while(true){
				
				Calendar c = Calendar.getInstance();
				int hour = c.get(Calendar.HOUR_OF_DAY);
				int min = c.get(Calendar.MINUTE);
				int second = c.get(Calendar.SECOND);

				String time = hour + " : "+ min + " : " + second;
				System.out.println(time);
				
				digClockGUI.setTimeOnLabel(time);
				
				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					e.printStackTrace();
					
					return;
				}
				
			
			}
	
	
		
	}
	}
}
