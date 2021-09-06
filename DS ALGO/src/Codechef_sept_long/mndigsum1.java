package Codechef_sept_long;

import java.util.*;

public class mndigsum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// loop from l - m, modulo by each value, if no remainder then store the
		// quotient in a var into an array or else, store the sum of quotient and
		// remainder into an array, thisis the sum. Now find the minmum in the array and
		// print the base corresponding to the min. For corresponding BASE store the
		// position of the min value and add it to L, and print that, that is the base.
		// LOGIC is that array index starts from 0; and loop started from l; so if let
		// us say 1st val was min then it's pos in array would be at the start, so index
		// wud be =  0; hence base would be 0 + L = L;

	    Scanner ob = new Scanner(System.in);
	    int t = ob.nextInt();
	    while(t-- > 0) {
	    	int N = ob.nextInt();
	    	int l = ob.nextInt();
	    	int r = ob.nextInt();
	    	List<Integer> ls = new ArrayList<>();
	    	
	    	for(int i = l; i <= r; i++) {
	    		int c = 0;
	    		if(N % i == 0) {
	    			//c = count()}
	    		}
	    		else {
	    			int quo = 0, rem;
	    			while(N / i > i) {
	    			quo = N / i;}
	    			rem = N % i;
	    			c = quo + rem;
	    		}
	    		ls.add(c);
	    		System.out.println(ls);
	    	}
	    	int min = 0, index = 0;
	    	for(int i : ls) {
	    		if(i < min) {
	    			min = i;
	    			index = ls.lastIndexOf(i);
	    		}
	    	}
	    	System.out.println(l+index);
	    }
	}
	
	public static int count(int n, int l, int m) {int c = 0;
		for(int i = l; i <= m; i++) { int n1 = n;
			while(n1 != 1 || n1 > i) {
				n /= i;
				c += 1;
			}	
		}
		return c; 
	}

}
