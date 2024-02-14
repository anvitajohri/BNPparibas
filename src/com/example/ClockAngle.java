package com.example;

public class ClockAngle {
	
	public static double findClockAngle(int hour, int minute) {
		double hourAngle = (hour % 12 + minute / 60.0) * 30;
		double minuteAngle = minute  * 6;
		
		double angleDiff = Math.abs(hourAngle - minuteAngle);
		
		return Math.min(angleDiff, 360 - angleDiff);
	}
	
	public static void main(String[] args) {
		int hour1 = 3;
		int minute1 = 0;
		
		System.out.println("Angle between hour and minute hands at"+ hour1 +":"
				+ minute1 + "is" + findClockAngle(hour1, minute1) + "degrees");
	

	
	int hour2 = 9;
	int minute2 = 30;
	
	System.out.println("Angle between hour and minute hands at"+ hour2 +":"
			+ minute2 + "is" + findClockAngle(hour2, minute2) + "degrees");
	}
}
