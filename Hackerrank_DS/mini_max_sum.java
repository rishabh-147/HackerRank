package Hackerrank_DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * Mini-Max Sum


 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.


 */

public class mini_max_sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * To find the min and max numbers.. just sort the array in ascending order...
		 * then first 4 have the minmum sum and the last four have the highest sum.
		 */
		List<Integer> arr = new ArrayList<>();
		Scanner ob = new Scanner(System.in);
		int c = 5; // took 5 coz it's given in the question that there will only be 5 integer
					// given.
		while (c-- > 0) {
			arr.add(ob.nextInt());

		}

		ob.close();

		// The question has to approaches to SORT the List.
		// Approach 1 -- Using Collections.sort() function
		// Approach 2 -- Using bubble sort

		// 1. Collections.sort(arr);

		/* 2 --> */ sort(arr);

		long min_sum = 0;
		long max_sum = 0;

		for (int i = 0; i <= 3; i++) {
			min_sum += arr.get(i);
		}

		for (int i = 4; i >= 1; i--) {
			max_sum += arr.get(i);
		}
		System.out.println(min_sum + " " + max_sum);

	}

	public static void sort(List<Integer> arr) {
		int n = arr.size() - 1;

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n - i - 1; j++) {
				if (arr.get(j) > arr.get(j + 1)) {
					int temp = arr.get(j + 1);
					arr.set(j + 1, arr.get(j));
					arr.set(j, temp);
					System.out.println("ok!!");
				}
			}
		}

	}

}