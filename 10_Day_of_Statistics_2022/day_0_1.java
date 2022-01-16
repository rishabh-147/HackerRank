package p1_10_DoF_STATS_2022;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * In the previous challenge, we calculated a mean. In this challenge, we practice calculating a weighted mean.
 */

public class day_0_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		ArrayList<Integer> X = new ArrayList<>(n);
		ArrayList<Integer> W = new ArrayList<>(n);
		for(int i = 0; i < n; i++) {
			X.add(ob.nextInt());
		}
		
		for(int i = 0; i < n; i++) {
			W.add(ob.nextInt());
		}
		
		day_0_1 d01 = new day_0_1();
		 System.out.println(d01.wmean(X, W));
		 
		 ob.close();

	}
	
	public double wmean(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> mult = product(a, b);
		double sum = (double) (array_sum(mult) / array_sum(b));
		
		// Below is the method to Round-Off a double value to N number of places. IT uses BigDecimal and RoundindMode.
		BigDecimal bd = new BigDecimal(Double.toString(sum));
	    bd = bd.setScale(1/*place up-to rounding is to be done.*/, RoundingMode.HALF_UP);
	    return bd.doubleValue();
		
	}
	
	public double array_sum(ArrayList<Integer> a) {
		double sum = 0.0f;
		for(int i : a) {
			sum += i;
		}
		return sum;
	}
	
	public ArrayList<Integer> product(ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList<Integer> prod = new ArrayList<>(a.size());
		for(int i = 0; i < a.size(); i++) {
			int p = a.get(i) * b.get(i);
			prod.add(i, p);
		}
		return prod;
	}

}




/*Input (stdin)

    5

    10 40 30 50 20

    1 2 3 4 5
    
    32.0
    
    */
