package Arrays;

import java.util.HashMap;

public class majoelentsintheArray {

	public static void main(String[] args) {
		   int[] arr = {2, 2, 1, 1, 1, 2, 2};
//			int result = findOccurances(arr);
//			System.out.println(result);
			
			int result2 = findByMooresAlgo(arr);
			System.out.println(result2);
			
		}
	


		private static int findByMooresAlgo(int[] arr) {

			int count = 0;
			int element = 0;
			//find the majority candidate
			for (int num : arr) {
				if (count == 0) {
					element = num;
				}
				if (element == num) {
					count++;
				} else {
					count--;
				}

			}
			//use same count variable and get how many oit is repeting in the array 
			//if the length is grater n/2 times return element 
			
			System.out.println("Element is " + element);
			count = 0;
			for (int num : arr) {
				if (num == element) {
					count++;
				}
			}
			System.out.println("Count in the array is " + count);
			
			if (count > arr.length / 2) {
				return element;
			} else {
				return -1;
			}

		}



		private static int findOccurances(int[] arr) {
			
			int n = arr.length;
			HashMap<Integer, Integer> hash = new HashMap<>();
			for(int num:arr)
			{
				hash.put(num, hash.getOrDefault(num,0)+1);
			}
			for(int key: hash.keySet())
			{
				if(hash.get(key)>n/2)
				{
					return key;
				}
			}
			return -1;
		}

	}