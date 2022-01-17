package Thirty_days_of_Code_2022;

import java.util.Scanner;

public class day_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		for(int i =1; i <= 10; i++) {
			System.out.println(n+" x "+i+" = "+(n* i));
		}
		ob.close();
	}

}
