package Hackerrank_DS;
/*
 * Given an array of integers, where all elements but one occur twice, find the unique element.

Example
[1,2,4,,5,2,4,1]
The unique element is 5.

 */


import java.util.Scanner;
import java.util.Stack;

public class lonely_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Use hash map... insert in hash map while inserting check for the presence of the same key
		//if so, then that means the number is duplicate else it's unique.
		
		
		Stack<Integer> stack = new Stack<>();
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		while(n-- >= 1) {
			
			int val = ob.nextInt();
			if(!stack.contains(val)) {
			//	System.out.println("*ok*");
				stack.push(val);
			}
			else {
			//	System.out.println("#ok#");
			//	System.out.println(
				stack.remove(stack.indexOf(val));
			}
		}
		
		System.out.println(stack.peek() );
		
		ob.close();
	}

}
