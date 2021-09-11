package Hackerrank_DS;

import java.util.Scanner;

public class array_Manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array of 'n' size
		//manipulation from 'a' to 'b' index with 'k'data.
		
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		int[] arr = new int[n];
		int query = ob.nextInt();
		
		
		while(query-- > 0)
		{
			int a = ob.nextInt();
			int b = ob.nextInt();
			int k = ob.nextInt();
			
			for(int i = a-1; i <=b-1; i++)
			{
				arr[i] = arr[i] + k;
			}
		}
		
		int Max = arr[0];
		for(int i : arr)
		{
			if(i > Max) Max = i;
		}
		System.out.println(Max);
	}

}
