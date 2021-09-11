package Hackerrank_DS;

import java.util.*;

public class zig_zag_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fix the smallest element then split the remaining sorted array into two then the later part place it to ri8 of smallest and then the former half is placed by reversing the array
		
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		List<Integer> arr = new ArrayList<>();
		while(n-- > 0) {
		arr.add(ob.nextInt());	
		}
		Collections.sort(arr);
		for(int i : arr) {
			System.out.print(i +" ");
		}
		System.out.println();
		List<Integer> zigzag = new ArrayList<>();
		zigzag.add(arr.remove(0));
		for(int i = (n/2) - 1; i < n; i++) {
			zigzag.add(arr.remove(i));
			for(int o : zigzag) {
				System.out.print(o +"**");
			}
		}
		Collections.reverse(arr);
		System.out.println();
		zigzag.addAll(arr);
		
		for(int i : zigzag) {
			System.out.print(i +" ");
		}
		
	}

}
