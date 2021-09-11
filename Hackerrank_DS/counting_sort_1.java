package Hackerrank_DS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class counting_sort_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare a user input array of n length
				//declare another array of 100 length 
				//traverse the user array and increment the index by 1 if the match is found
				
				// prefer hashmap
				
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		int[] arr = new int[n];
		int[] count = new int [100];
		int c = 0;
		while(n-- > 0) {
			arr[c++] = ob.nextInt();
		}
		for(int i : arr) {
			count[i] += 1;
		}
		
		for(int i : count)
		{
			System.out.print(i+" ");
		}
	}

}
