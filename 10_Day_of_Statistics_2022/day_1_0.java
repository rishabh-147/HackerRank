package p1_10_DoF_STATS_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * In this challenge, we practice calculating quartiles. 
 */
public class day_1_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		ArrayList<Integer> arr = new ArrayList<>(n);
		for(int i = 0; i < n; i++) {
			arr.add(ob.nextInt());
		}
		//sorting the array;
		Collections.sort(arr);
		
		day_1_0 d10 = new day_1_0();
		
		System.out.println(d10.Q1(arr));
		System.out.println(d10.Q2(arr));
		System.out.println(d10.Q3(arr));
		
		ob.close();
	}

	// Median of a given array within a given index
	public int median(ArrayList<Integer> arr, int start_index, int end_index) {
		ArrayList<Integer> a = new ArrayList<>(end_index - start_index);
		for(int i = start_index; i < end_index; i++) {
			a.add(arr.get(i));
		}
		
	//debugingg   	
		System.out.println(a);
		int n = a.size();
		int sum = 0;
		if (n % 2 == 0) {
			sum = a.get((n / 2) - 1) + a.get(n / 2);
			sum = sum / 2;
			return sum;
		}
		return a.get(n / 2);
	}

	public int Q1(ArrayList<Integer> a) {
		int n = a.size();
		return median(a, 0, (n /2) );

	}

	public int Q2(ArrayList<Integer> a) {
		return median(a, 0, a.size());
	}

	public int Q3(ArrayList<Integer> a) {
		int n = a.size();
		if(n % 2 != 0)
		return median(a, (n/2) + 1, n);
		else
		return median(a, (n /2), n);
	}

}
