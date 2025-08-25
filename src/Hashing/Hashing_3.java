package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Hashing_3 {
	
	public static void main(String[] args) {
		int arr[] = {10, 5, 10, 15, 10, 5};
		int n = arr.length;
		frequency(arr,n);
	}

	private static void frequency(int[] arr, int n) {
		
		HashMap<Integer,Integer> mp = new HashMap<>();
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}
		int maxElement =0,minElement = 0;
		int maxFreq =0, minFrequency =n;
		
		for(Map.Entry<Integer, Integer> entry:mp.entrySet())
		{
			int count = entry.getValue();
			int element = entry.getKey();
					if(count>maxFreq)
					{
						maxElement = element;
						maxFreq=count;
					}
			if(count<maxFreq)
			{
				minElement = element;
				minFrequency = count;
			}
			
		}
		System.out.println("Highest Freq" + maxElement);
		System.out.println("Lowest Freq " + minElement);
	}

}
