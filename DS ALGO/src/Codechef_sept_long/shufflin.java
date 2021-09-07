package Codechef_sept_long;

import java.util.*;

public class shufflin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ob = new Scanner(System.in);
		int  t = ob.nextInt();
		
		while(t-- > 0) {
			int N = ob.nextInt();
			List<Integer> list = new ArrayList<>();
			for(int j = 1; j <= N; j++) {
				int input = ob.nextInt();
				list.add(input);
			}
			for(int i = 1; i < list.size(); i += 2) {
				list = shuffle(list, i);
			}
			System.out.println(list);
		
		System.out.println(mod(list));
		}
	}
	//shuffle two indexes with each other.
	public static List<Integer> shuffle(List<Integer> list, int  x){
		
		if(list.size() > (x +1))	{
			int temp = list.get(x);
			list.set(x, list.get(x + 1));
			list.set(x + 1, temp);
			
			return list;
		}
		else {
			return list;
		}
		
	}
	public static int mod(List<Integer> list) {
		int sum = 0, count = 1;
		for(int i : list) {
			int x = i + count++;
			sum += x % 2;
		}
		return sum;
	}

}
