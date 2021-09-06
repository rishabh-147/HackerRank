package Codechef_sept_long;

import java.util.Scanner;

public class travalps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int t = ob.nextInt();
		while(t-- > 0) {
			int N = ob.nextInt();
			int A = ob.nextInt();
			int B = ob.nextInt();
			String s = ob.next();
			int time = 0;
			for(int i = 0; i < N; i++)
			{
				char ch = s.charAt(i);
				if(ch == '1') time += B;
				else time += A;
					
			}
			System.out.println(time);
	}
	}
}
