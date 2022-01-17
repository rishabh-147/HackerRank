package Thirty_days_of_Code_2022;

import java.util.Scanner;

public class day_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		double m = ob.nextDouble();
		int t = ob.nextInt();
		int tax = ob.nextInt();
		
		day_2 d2 = new day_2();
		System.out.println((int)d2.bill(m, t, tax));
		ob.close();

	}
	
	public double bill(double meal, int tip, int tax) {
		double bill = meal;
		bill += (meal / 100) * tip;
		bill += (meal / 100) * tax;
	//	System.out.println(bill);
		return Math.round(bill);
	}

}
