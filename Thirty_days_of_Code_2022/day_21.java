package Thirty_days_of_Code_2022;

import java.util.Scanner;

public class day_21 {
	int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		day_21 d21 = new day_21();
		d21.a = new int[n];
		int x = 0;
		while(n-- > 0) {
			d21.a[x++] = ob.nextInt();
		}
		
		int swap = d21.sort(d21.a);
		System.out.println("Array is sorted in "+swap+" swaps.");
		System.out.println("First Element: "+d21.a[0]);
		System.out.println("Last Element: "+d21.a[x - 1]);
		
	}
	
	public int sort(int[] a) {
		int swap = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length - 1; j++) {
				if(a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swap++;
				}
			}
		}
		return swap;
		
	}
	
	

}
