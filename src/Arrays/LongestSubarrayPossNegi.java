package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayPossNegi {
	
	public static void main(String[] args) {
		int [] arr = {2,3,5};
	int k = 5;
		int maxLenght = findLengthOfSubArray(arr,k);
		System.out.println("Result is " + maxLenght);
		}

	private static int findLengthOfSubArray(int[] arr, int k) {
		int sum =0;
		int maxLen = 0;
		HashMap<Integer, Integer> val = new HashMap();
		
		for(int i =0;i<arr.length;i++)
		{
			sum = sum + arr[i];
			
			if(sum ==k)
			{
				maxLen = i+1;
			}
			if(val.containsKey(sum-k))
			{
				maxLen = Math.max(maxLen, i-val.get(sum-k));
			}
			if(!val.containsKey(sum))
			{
				val.put(sum, i);
			}
		}
		return maxLen;
	}
	}
