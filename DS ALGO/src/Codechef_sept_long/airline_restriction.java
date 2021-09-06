package Codechef_sept_long;

import java.util.Scanner;

public class airline_restriction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// except the values
		// add the bags wt.
		// add the allowed wt.
		// compare... allowed > bag wt YES else NO

		Scanner ob = new Scanner(System.in);
		int t = ob.nextInt();

		while (t-- >= 0) {
	        int A = ob.nextInt();
	        int B = ob.nextInt();
	        int C = ob.nextInt();
	        int D = ob.nextInt();
	        int E = ob.nextInt();

		if ((D + E) >= (A + B + C)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
							
		}

	}

}
