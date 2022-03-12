package javaproject;

import java.util.Calendar;



public class arr2_20 {

	public static void main(String[] args) {

		
		Week today = null;
		
		
		Calendar calendar = Calendar.getInstance();
		
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year);
		System.out.println(month+1);
		System.out.println(day);
		System.out.println(week);

		
		
		switch(week) {
		
		case 1:
			today = Week.SUNDAY;
			break;
		
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 7:
			today = Week.MONDAY;
			break;
		}System.out.println(today);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
