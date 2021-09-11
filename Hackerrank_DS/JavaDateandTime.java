package Hackerrank_DS;


import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateandTime {
//input function 
	int dd,mm,yy;
	private void input()
	{
		Scanner ob = new Scanner(System.in);
		String input = ob.nextLine();
		
		 dd = Integer.parseInt(input.substring(0,2));
		 mm = Integer.parseInt(input.substring(3,5));
		 yy = Integer.parseInt(input.substring(7));
		
		ob.close();
	}
	
//a function to use gregorian calendar class in java.util
	
	private void dayOfweek()
	{
	 LocalDate ld = LocalDate.of(yy,mm,dd);
	 System.out.println(ld.getDayOfWeek().name());
	 
	 
	
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		JavaDateandTime ob = new JavaDateandTime();
		while(true) {
		ob.input();
		ob.dayOfweek();
		}

	}

}
