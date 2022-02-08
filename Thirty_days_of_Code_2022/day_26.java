package Thirty_days_of_Code_2022;

import java.util.Scanner;

public class day_26 {
//For those interested: If a number is divisable by another number less or equal to the square root of the first number... it is NOT prime. That is the reason for O(sqrt(n)) run time.

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
/*
 * 
	    private static boolean isPrime(int num) {
	        if (num == 1) return false;
	        for (int i = 2; i < Math.sqrt(num); i++)
	            if (num % i == 0) return false;
	        return true;
	    }
	}*/
}
