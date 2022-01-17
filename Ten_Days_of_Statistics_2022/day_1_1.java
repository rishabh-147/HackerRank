package Ten_Days_of_Statistics_2022;
/*
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * In this challenge, we practice calculating the inter-quartile range.
 *
public class day_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		
		ArrayList<Integer> finalArray = new ArrayList<>();
		ArrayList<Integer> E = new ArrayList<>(n);
		ArrayList<Integer> Freq = new ArrayList<>(n);
		for(int i = 0; i < n; i++) {
			E.add(ob.nextInt());
		}
		for(int i = 0; i < n; i++) {
			Freq.add(ob.nextInt());
		}
		
		day_1_1 d11 = new day_1_1();
		finalArray.addAll(d11.final_array(E, Freq));
//		System.out.println(E);
//		System.out.println(Freq);
		System.out.println(finalArray);
		System.out.println(d11.range(finalArray));
		ob.close();
	}
	
	public ArrayList<Integer> final_array(ArrayList<Integer> E, ArrayList<Integer> Freq){
		ArrayList<Integer> finArr = new ArrayList<>();
		for(int i = 0; i < E.size(); i++) {
			int t = Freq.get(i);
			while(t-- > 0) {
				finArr.add(E.get(i));
			}
		}
		
		return finArr;
	}
	
	public double median(ArrayList<Integer> arr, int start_index, int end_index) {
		ArrayList<Integer> a = new ArrayList<>();
		for(int i = start_index; i < end_index; i++) {
			a.add(arr.get(i));
		}
		int n = a.size();
		double sum = 0;
		if (n % 2 == 0) {
			sum = a.get((n / 2) - 1) + a.get(n / 2) + 0.0;
			sum = sum / 2.0;
			
		return sum;
		}
		return a.get(n / 2) + 0.0;
	}

	public double Q1(ArrayList<Integer> a) {
		int n = a.size();
		return median(a, 0, (n /2) );

	}

	public double Q3(ArrayList<Integer> a) {
		int n = a.size();
		if(n % 2 != 0)
		return median(a, (n/2) + 1, n);
		else
		return median(a, (n /2), n);
	}
	
	public double range(ArrayList<Integer> a) {
		return (Q3(a) - Q1(a))+0.0;
	}

}
*/


import java.io.*;
import java.util.*;

public class day_1_1 {

    private static double computeMean(int[] x) {
        if (x.length % 2 == 0) {
            return (x[x.length / 2] + x[(x.length / 2) - 1] + 0.0) / 2;    
        }
        else {
            return x[x.length / 2] + 0.0;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] x = new int[n];
        int[] f = new int[n];
        
        for (int i = 0; i < n; ++i) {
            x[i] = scanner.nextInt();
        }
        
        int l = 0;
        for (int i = 0; i < n; ++i) {
            f[i] = scanner.nextInt();
            l += f[i];
        }
        
        int[] s = new int[l];
        int k = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < f[i]; ++j, ++k) {
                s[k] = x[i];
            }
        }
        
        Arrays.sort(s);
        double Q1 = 0, Q3 = 0;
        
        if (l % 2 == 0) {
            Q1 = computeMean(Arrays.copyOfRange(s, 0, l / 2));
            Q3 = computeMean(Arrays.copyOfRange(s, l / 2, l));
        }
        else {
            Q1 = computeMean(Arrays.copyOfRange(s, 0, l / 2));
            Q3 = computeMean(Arrays.copyOfRange(s, (l / 2) + 1, l));
        }
        
        System.out.printf("%.1f\n", (Q3 - Q1));
    }
}
