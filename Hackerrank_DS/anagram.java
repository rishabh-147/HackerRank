package Hackerrank_DS;

import java.util.Scanner;

public class anagram {
/*
 *Takes 2 strings as input and verifies whether they r anagram or not. 
 */

	public static void main(String[] args) {
		
		// take 2 for loops i and j and check if every char of A matches with every char
		// of b. IF MATCH FOUND REMOVE THAT CHAR FROM BOTH THE
		// STRINGS......in the end check if both the strings are empty...if so they are
		// anagram else not
		Scanner ob = new Scanner(System.in);
		String a = (ob.nextLine()).toLowerCase();
		String b = (ob.next()).toLowerCase();
		int la = a.length();
		int lb = b.length();
		ob.close();
		if(lb != la)
		{
			System.out.println("Not Anagram");
			
		}
		else {
		int x, y;
		while(la != 0) {
			x = 0;
			y = 0;
			while(lb != 0 && y < lb) {
				if (a.charAt(x) == b.charAt(y)) {
					a = a.substring(0, x) + a.substring(x + 1);
					b = b.substring(0, y) + b.substring(y + 1);
					
					lb -= 1;
				}
				else
				y += 1;
				
				
			}
			la -= 1;
		//	 System.out.println(a+" "+b);

		}
		if (a.equals(b))
			System.out.println("ANAGRAM");
		else
			System.out.println("NOT ANAGRAM");
	}
	}

}
