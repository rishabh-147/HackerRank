package Thirty_days_of_Code_2022;

import java.util.Scanner;

public class day_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		int[] a = new int [n];
		while(--n >= 0) {
			a[n] = ob.nextInt();
		}
		day_7 d7 = new day_7();
		d7.print(a);
		
	}
	public void print(int[] a) {
		for(int i = 0 ; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
