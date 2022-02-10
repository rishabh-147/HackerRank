package Thirty_days_of_Code_2022;

import java.util.*;

public class day_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int T = ob.nextInt();

		while (T-- > 0) {
			int N = ob.nextInt();
			int K = ob.nextInt();
			int and = 0;
			ArrayList<Integer> arr = new ArrayList<>(N);
			
			for(int i = 1; i <= N; i++)
			{
				arr.(i, new ArrayList<Integer>());
			}
			for(int i = 1; i < N; i++) {
				for(int j = i +1; j <= N; j++) {
					and = (i & j);
					
				}
			}
			System.out.println(and);
			
		}
	}
	
}
