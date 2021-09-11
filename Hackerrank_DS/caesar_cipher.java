package Hackerrank_DS;

import java.util.Scanner;

public class caesar_cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// check for the coming char to be a char [a-zA-Z]
		// convert it into ASCII, then add the 'K' and convert back to char and create
		// new string.

		Scanner ob = new Scanner(System.in);
		int len = ob.nextInt();
		String s = ob.next();
		int k = ob.nextInt();
		
		String out = "";
		for (int i = 0; i < len; i++) {
			int ch = s.charAt(i);
			if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {

				int cyp = (ch + k);
			//debug	System.out.println("##" + (char) cyp);
				while( (cyp > 90 && cyp < 97 || cyp > 122)) {
					cyp -= 26;
			//debug		System.out.println("** " + (char) cyp);
				}
				out = out + (char) cyp;
			} else {
				out = out + s.charAt(i);
			}
		}
		System.out.println(out);

	}

}
