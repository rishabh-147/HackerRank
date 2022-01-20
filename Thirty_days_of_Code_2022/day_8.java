package Thirty_days_of_Code_2022;

/*Given  names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. 
 * You will then be given an unknown number of names to query your phone book for. 
 * For each  queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; 
 * if an entry for  is not found, print Not found instead.

 * Note: Your phone book should be a Dictionary/Map/HashMap data structure.
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class day_8 {
	Map<String, Long> map;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day_8 d8 = new day_8();
		Scanner ob = new Scanner(System.in);
		int size = ob.nextInt();
		d8.map = new HashMap<>(size);
		while (size > 0) {
			size -= 1;
			d8.insert(ob.next(), ob.nextLong());
		}
		while (ob.hasNext()) {
			String search = ob.next();
			long out = d8.find(search);
			if (out == -1)
				System.out.println("Not found");
			else {
				System.out.println(search + "=" + out);
			}
		}
		ob.close();
	}

	public void insert(String key, long value) {
		map.put(key, value);
	}

	public long find(String name) {
		if (map.containsKey(name)) {
			return map.get(name);
		}
		return -1;
	}

}

/*
 * INPUT 3 sam 99912222 tom 11122222 harry 12299933 sam edward harry
 * 
 * OUTPUT
 * 
 * sam=99912222 Not found harry=12299933
 */
