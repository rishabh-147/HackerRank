package Hackerrank_DS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class diagonal_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		int[][] arr = new int[n][n];
			
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = ob.nextInt();
			}
		}
			
		int d1 = 0, d2 = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j)
				{
				d1 += arr[i][j];	
				}
				if((i + j) == n-1)
				{
				d2 += arr[i][j];
				}
				
			}
		}
			

			
			System.out.println(Math.abs(d1 - d2));
		}
}
