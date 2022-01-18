package Thirty_days_of_Code_2022;

import java.util.Scanner;

public class day_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int t = ob.nextInt();
	//	ob.next();
		day_6 d6 = new day_6();
		while(t > 0) {
		String s = ob.next();
	
		System.out.println(""+d6.evenChar(s) + " "+ d6.oddChar(s));
		t -= 1;
		}
		ob.close();
		
	}
	
	public String oddChar(String s) {
		String odd = "";
		for(int i = 1; i < s.length(); i= i + 2) {
			odd += s.charAt(i);
		}
		return odd;
	}

	public String evenChar(String s) {
		String even = "";
		for(int i = 0; i < s.length(); i= i + 2) {
			even+=  s.charAt(i);
		}
		return even;
	}
}
