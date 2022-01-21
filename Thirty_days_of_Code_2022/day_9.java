package Thirty_days_of_Code_2022;

import java.util.Scanner;

public class day_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day_9 d9 =  new day_9();
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		System.out.println(d9.fact(n));
	}
	public int fact(int n) {
		if(n <= 1) return 1;
		else return n * fact(n - 1);
	}

}
