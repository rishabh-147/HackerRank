package Codechef_sept_long;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class shufflin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ob = new Scanner(System.in);
		int  t = ob.nextInt();
		
		while(t-- > 0) {
			int N = ob.nextInt();
			List<Integer> list = new ArrayList<>();
			for(int j = 1; j <= N; j++) {
				int input = ob.nextInt();
				list.add(input);
			}
			int sum = 0, c = 1;
			for(int i : list) {
				{
					sum += ((i + c++) % 2);
				}
			}
			System.out.println(sum);
		}
		

	}

}
