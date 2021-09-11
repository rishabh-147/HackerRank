package Hackerrank_DS;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class left_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		int d = ob.nextInt();
		Queue<Integer> arr = new ArrayDeque<>();
		
		for(int i = 0; i < n; i++)
		{
			arr.add(ob.nextInt());
		}
		
		while(d-- > 0)
		{
			int shift = arr.remove();
			arr.add(shift);
		}
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		ob.close();
		}

}
