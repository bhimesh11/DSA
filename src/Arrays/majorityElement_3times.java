package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class majorityElement_3times {

	public static void main(String[] args) {

		int[] arr = { 11, 33, 33, 11, 33, 11 };
//		int element = findElement(arr);
//		System.out.println(" Element is " + element);
		ArrayList<Integer> list = findElementUsingMooresAlgo(arr);
		System.out.println(list);
	}

	private static ArrayList<Integer> findElementUsingMooresAlgo(int[] arr) {

		// for(int u)
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count1 = 0, count2 = 0;
		int element1 = 0, element2 = 0;
		for (int i =0;i<arr.length;i++) {
			if (count1 == 0 && element2 != arr[i]) {
				count1 = 1;
				element1 = arr[i];
			} else if (count2 == 0 && element1 != arr[i]) {
				count2 =1;
				element2 = arr[i];
			} else if (arr[i] == element1) {
				count1++;
			} else if (arr[i] == element2) {
				count2++;
			} else {
				count1--;
				count2--;
			}

		}
		count1 = 0;
		count2 = 0;
		
		for (int i =0;i<arr.length;i++) {
			
			if (arr[i] == element1) {
				count1++;
			}
			if (arr[i] == element2) {
				count2++;
			}
		}

			int len = (arr.length / 3) + 1;
			
			
			if (count1 >= len) {
				
				list.add(element1);
			}
			if (count2 >= len) {
				
				list.add(element2);
			}
			
		
	Collections.sort(list);
		return list;
	}

	private static int findElement(int[] arr) {

		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

		for (int nums : arr) {
			if (hash.containsKey(nums)) {
				hash.put(nums, hash.getOrDefault(nums, 0) + 1);
			} else {
				hash.put(nums, 1);
			}
		}
		for (int keys : hash.keySet()) {
			if (hash.get(keys) == 3) {
				return keys;
			}
		}
		return -1;
	}

}
