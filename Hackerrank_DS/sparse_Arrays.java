package Hackerrank_DS;

import java.util.*;

public class sparse_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2 arrays 
		//print the occurrences of 1's element in other on an array
		Scanner ob = new Scanner(System.in);
		//normal strings
		int Nsize = Integer.parseInt(ob.next());
		List<String> Strings = new ArrayList<>();
		while(Nsize-- > 0)
		{
			Strings.add(ob.next());
		}
		//query strings
		int Qsize = Integer.parseInt(ob.next());
		List<String> Queries = new ArrayList<>();
		while(Qsize-- > 0)
		{
			Queries.add(ob.next());
		}
		//comparison
		for(String s : Queries)
		{
			int count =0;
			for(String s1  : Strings)
		    {if(s.equals(s1)) count+=1;
		    }
		  System.out.println(count);
		ob.close();
		}
		
	}

}
