package Thirty_days_of_Code_2022;

import java.util.Scanner;

public class day_3 {
	
	    public static void main(String[] args){
	        
	        Scanner ob = new Scanner(System.in);
	        int n = ob.nextInt();
	         if(n%2 == 0){
	            if((n >= 2 && n <= 5 )|| n > 20) System.out.println("Not Weird");
	            else System.out.println("Weird");
	        }else{
	            System.out.println("Weird");
	        }
	    }
	        
	


}
