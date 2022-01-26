package Thirty_days_of_Code_2022;

import java.util.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    public Difference(int[] a){
        this.elements = a;
        this.maximumDifference = 0;
    }
    
    public void computeDifference(){
        int diff = 0;
        for(int i = 0; i < elements.length; i++){
            for(int j = i; j < elements.length; j++){
                diff = Math.abs(elements[i] - elements[j]);
                if(diff > maximumDifference) maximumDifference = diff;
            }           
        }
    }
} // End of Difference class

public class day_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
