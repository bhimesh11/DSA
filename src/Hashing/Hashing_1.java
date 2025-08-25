package Hashing;

import java.util.*;

public class Hashing_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Map<Integer, Integer> mp = new HashMap();

		for (int i = 0; i < arr.length - 1; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> itr : mp.entrySet()) {
			System.out.println(itr.getKey() + " appears " + itr.getValue());
		}

		int q;
		q = sc.nextInt();
		while (q-- > 0) {
			int number;
			number = sc.nextInt();
			if (mp.containsKey(number)) {
				System.out.println(mp.get(number));
			} else {
				System.out.println(0);
			}
		}
	}

}
