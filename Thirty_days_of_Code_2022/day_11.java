package Thirty_days_of_Code_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class day_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		day_11 d11 = new day_11();
		Scanner ob = new Scanner(System.in);
		int[][] a = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				a[i][j] = ob.nextInt();
			}
		}
		d11.partition(a);
	}

	public void partition(int[][] a) {
		int len = a.length;
		int maxSum = Integer.MIN_VALUE; //not equal to 0 coz if the sum is negative the maxSum will always be 0 and not negative, arising logical error.

		int sum = 0;
		for (int i = 0; i < a.length - 2; i++) {

			for (int j = 0; j < a.length - 2; j++) {
				sum = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1]
						+ a[i + 2][j + 2];

				if (maxSum < sum)
					maxSum = sum;
			}
		}
		System.out.println(maxSum);

	}
}
