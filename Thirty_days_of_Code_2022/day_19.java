package Thirty_days_of_Code_2022;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class day_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		day_19 d19 = new day_19();
		
		Scanner ob = new Scanner(System.in);
		String s = ob.nextLine();
		if(d19.checkPalindrome(s)) {
			System.out.println("The word, "+s+", is a palindrome.");
		}else {
			System.out.println("The word, "+s+", is not a palindrome.");
		}
		ob.close();
	}
	
	public boolean checkPalindrome(String s) {
		int flag = 0;
		Stack<Character> stack = new Stack<>();
		Queue<Character> queue = new LinkedList<>();

		for(int i = 0; i < s.length();  i++) {
			char ch = s.charAt(i);
			stack.push(ch);
			queue.add(ch);
		}
		
		while(!stack.isEmpty() && !queue.isEmpty()) {
			if(stack.pop() != queue.poll()) {
				flag = 1;
				break;
			}
		}
		if(flag == 0)
		return true;
		return false;
	}

}
