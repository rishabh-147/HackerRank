package Thirty_days_of_Code_2022;

import java.util.Scanner;

public class day_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		try {
		String s = ob.nextLine();
		
		int n = Integer.parseInt(s);
		System.out.println(n);
		}catch(NumberFormatException e) {
			System.out.println("Bad String");
		}
		ob.close();
	}
	

}
