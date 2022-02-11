package Thirty_days_of_Code_2022;

import java.util.*;

public class day_30 {
	
	// APPROACH 1 --> Less Time Complexity
		    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner ob = new Scanner(System.in);
	        int T = ob.nextInt();

	        while (T-- > 0) {
	            int N = ob.nextInt();
	            int K = ob.nextInt();
	            int max = 0;
	            
	            for(int i = 1; i < N; i++) {
	                int and = 0;
	                for(int j = i +1; j <= N; j++) {
	                   and = (i & j);
	                    if((and) < K && and > max)
	                        max = and;
	                }
	            }
	            System.out.println(max);
	            
	        }
	    ob.close();
		    }
	    
	}



//APPROACH 2 --> Time Complexity High
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int T = ob.nextInt();

		while (T-- > 0) {
			int N = ob.nextInt();
			int K = ob.nextInt();
			int max = 0;
			
			for(int i = 1; i < N; i++) {
				ArrayList<Integer> arr = new ArrayList<>(N);
				
				for(int j = i +1; j <= N; j++) {
					if((i & j) < K)
					arr.add((i & j));
					
				}
				Collections.sort(arr);
				if(arr.size() > 0 && arr.get(arr.size() - 1) > max) max  = arr.get(arr.size() - 1);
			}
			System.out.println(max);
			
		}
	}
	
}

*/

