package Thirty_days_of_Code_2022;

import java.util.Scanner;

public class day_4 {

	    private int age;	
	  
		public day_4(int initialAge) {
	  		// Add some more code to run some checks on initialAge
	          if(initialAge >= 0) this.age = initialAge;
	          else{
	              this.age = 0;
	              System.out.println("Age is not valid, setting age to 0.");
	     
	          }
		}

		public void amIOld() {
	  		// Write code determining if this person's age is old and print the correct statement:
	          if(this.age < 13)
	        System.out.println("You are young.");
	        else if(this.age >= 13 && this.age < 18)
	        System.out.println("You are a teenager.");
	        else
	        System.out.println("You are old.");
		}

		public void yearPasses() {
	  		// Increment this person's age.
	          this.age += 1;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			for (int i = 0; i < T; i++) {
				int age = sc.nextInt();
				day_4 p = new day_4(age);
				p.amIOld();
				for (int j = 0; j < 3; j++) {
					p.yearPasses();
				}
				p.amIOld();
				System.out.println();
	        }
			sc.close();
	    }
	}
