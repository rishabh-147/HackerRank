package Thirty_days_of_Code_2022;

import java.util.HashMap;
import java.util.Scanner;

public class day_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day_10 d10 = new day_10();
		
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		
		System.out.println(d10.countOne(d10.toBinary(n)));
	}
	
	public int countOne(long bin) {
		int count =0;
		String s = "" + bin;
// debug	System.out.println(s);
		for(int i = 0; i < s.length(); i++) {
		if(s.charAt(i) == '0') continue; 
			
			else{
			int c = i, tempc = 0;
			while(c < s.length() && s.charAt(c++) == '1') {tempc += 1;	
			}
		if(tempc > count) count  = tempc;
		}
		}
			
		return count;
	}
	
	public long toBinary(int dec) {
		long binary = 0;
		String bin = "";
		while(dec > 0) {
			bin = (dec % 2) + bin;
			dec =dec / 2;
		
		}
// debug		System.out.println(bin);
		binary = Long.parseLong( bin);
		return binary;
	}

}

/*
 
999
1111100111
1111100111
5

*/