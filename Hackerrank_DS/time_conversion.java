package Hackerrank_DS;

import java.util.Scanner;

/*
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
	  - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 */

public class time_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Check for the last AM or PM
		//2. if AM then 1. if the hour is < 12 i.e 1, 2, 3.... then print the whole time but ommit printing AM.
		//				2. if hour is == 12 then replace 12 with 0;		
	//			if PM then 1. if hours is > 12 then add 12 to the hour and print whole string ommiting PM
		//					2. if hours is == 12 then just print the string 
		
		
		Scanner ob = new Scanner(System.in);
		String s = ob.next();
		ob.close();
		
		int len = s.length(); 
		char meridiem = s.charAt( len - 2);
		int hour = Integer.parseInt((s.substring(0, 2)));
		if(meridiem == 'A') // that means the tym is in AM.
		{
			if( hour < 12) {
				System.out.println(s.substring(0, len - 2));
			}
			else {
				System.out.println("00"+s.substring(2, len - 2));
			}
		}
		if(meridiem == 'P' ) //that means the tyn is in PM
		{
			if(hour == 12) {
				System.out.println(s.substring(0, len - 2));
			}
			else {
				hour += 12;
				System.out.println(hour + ""+s.substring(2, len - 2));
			}
		}
	}

}
