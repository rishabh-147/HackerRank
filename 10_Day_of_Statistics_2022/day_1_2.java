package p1_10_DoF_STATS_2022;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * In this challenge, we practice calculating standard deviation. 
 */
public class day_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		ArrayList<Integer> arr = new ArrayList<>(n);
		while(n-- > 0) {
			arr.add(ob.nextInt());
		}
		
		day_1_2 d12 = new day_1_2();
		float standard_div = d12.stdiv(arr);
		System.out.printf("%.1f\n", standard_div);

	}
	
	public float mean(ArrayList<Integer> a) {
		float sum = 0.0f;
		for(int i : a) {
			sum += i;
		}
		return sum/(float) a.size();
	}
	
	public float stdiv(ArrayList<Integer> a) {
		float stdiv = 0.0f;
		float m = mean(a);
		//System.out.println(m);
		for(int i : a) {
			float sum = (float) Math.pow((i - m), 2);
			stdiv += sum;
			//System.out.println(i);
			//System.out.print(stdiv+"....");
		}
		return (float) Math.sqrt(stdiv /(float)a.size());
	}

}
