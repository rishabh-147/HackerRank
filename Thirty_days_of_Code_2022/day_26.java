package Thirty_days_of_Code_2022;

import java.util.Scanner;

public class day_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int t = ob.nextInt();
		while(t-- > 0) {
			int c= 0;
			int n = ob.nextInt();
			for(int i = 1; i <= n; i++) {
				if(n % i == 0) {
					c++;
				}
			}
			if(c == 2) System.out.println("Prime");
			else System.out.println("Not Prime");
		}

	}

}