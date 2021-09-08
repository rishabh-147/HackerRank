package Codechef_sept_long;

import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;

public class palint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// accept the values in an array
		// create two maps, in the first one insert the occurrence of the values in
		// given
		// array, in the second map, store the number of times a value occurred while
		// XOR
		// with N.
		// print the maximum number of occurrences and the number of XORs used (the
		// value
		// stored in 2nd map.)

		Scanner ob = new Scanner(System.in);
		try {
			int t = ob.nextInt();
			while (t-- > 0) {
				int len = ob.nextInt();
				int N = ob.nextInt();
				List<Integer> A = new ArrayList<>();
				for (int i = 0; i < len; i++) {
					A.add(ob.nextInt());
				}
				Map<Integer, Integer> mapA = new HashMap<>();
				Map<Integer, Integer> mapB = new HashMap<>();

				// Occurrence of each element of array
				int count = 0;
				for (int i : A) {
					if (mapA.containsKey(i)) {
						count = mapA.get(i);
						count += 1;
						mapA.replace(i, count);
					} else {
						mapA.put(i, 1);
					}
				}
				// System.out.println(mapA.entrySet() + "\n\n\n");
				// inserted the xor values in the MAP B.
				for (int i : A) {
					int c = 0;
					int xor = i ^ N;
					if (mapB.containsKey(xor)) {
						c = mapB.get(xor);
						c += 1;
						mapB.replace(i, c);
					} else {
						mapB.put(xor, 1);
					}
				}

				// merge both the maps to A incrementing the values of the pre-existing keys
				// accordingly;

				for (int i : mapB.keySet()) {
					if (mapA.containsKey(i)) {
						mapA.replace(i, (mapA.get(i) + mapB.get(i))); // increment by 1 if the value exists.
					} else {
						mapA.put(i, mapB.get(i));
					}
				}

				BigInteger max = BigInteger.ZERO;
				BigInteger op = BigInteger.ZERO;
				for (Entry<Integer, Integer> i : mapA.entrySet()) {
					if (BigInteger.valueOf(i.getValue()).compareTo(max) > 0) {
						max = BigInteger.valueOf(i.getValue());
						if (mapB.containsKey(i.getKey())) {
							op = BigInteger.valueOf(mapB.get(i.getKey()));
						}
					}
				}
				if (max == BigInteger.ONE) {
					op = BigInteger.ZERO;
				}
				// System.out.println(mapA.entrySet());
				System.out.println(max + " "+ op);
				}
			ob.close();
		} catch (Exception E) {
			return;
		}

	}
}
