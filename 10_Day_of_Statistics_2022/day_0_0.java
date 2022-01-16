package p1_10_DoF_STATS_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * In this challenge, we practice calculating quartiles. 
 */
public class day_0_0{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		ArrayList<Integer> arr = new ArrayList<>(n);
		for(int i = 0; i < n; i++) {
			arr.add(ob.nextInt());
		}
		
		day_0_0 d11 = new day_0_0();
		// mean
		//System.out.println(arr.size());
		System.out.println(d11.mean(arr));
		// median
		System.out.println(d11.median(arr));
		
		// mode
		System.out.println(d11.mode(arr));
		ob.close();
	}

	public float mean(ArrayList<Integer> a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum / a.size();

	}

	public double median(ArrayList<Integer> a) {
		Collections.sort(a);
		int n = a.size();
		float sum = 0;
		if (n % 2 == 0) {
			sum = a.get((n / 2) - 1) + a.get(n / 2);
			sum = sum / 2;
			return sum;
		}return a.get(n/2);

	}

	public int mode(ArrayList<Integer> a) {
		int max =0, pos = 0;
		int count = 0, j = 0;
		Collections.sort(a);
		for(int i : a) {
			count = 0;
			
			while(j <= (a.size() - 1) && i == a.get(j) ) {
				count++;
				j++;
				
			}
		//	System.out.println(count + "...."+i+"........."+j);
			if( max < count) {
				max = count;
				pos = j;
			}
		//	System.out.println(+max+"............"+count + "...."+i+"........."+j);
		}
	//	System.out.println(a);
		return a.get(pos-1);
	}

}


/*INPUT
 *  10

    64630 11735 14216 99233 14470 4978 73429 38120 51135 67060
	
	OUTPUT
	43900.0
	44627.5
	4978
*/
