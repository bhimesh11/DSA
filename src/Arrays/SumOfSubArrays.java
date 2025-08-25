package Arrays;

import java.util.HashMap;

public class SumOfSubArrays {
	
	public static void main(String[] args) {
		
		int [] arr = {3,1,2,4};
		int k =6;
		int count = findSubArraySum(arr,k);
		System.out.println(count);
	}

	private static int findSubArraySum(int[] arr, int k) {
		
		HashMap<Integer, Integer> sumFreq = new HashMap<Integer, Integer>();
		
		int count =0;
		int preSum =0;
		sumFreq.put(0, 1);
		
		for(int nums:arr)
		{
			preSum = preSum + nums;
			if(sumFreq.containsKey(preSum-k))
			{
				count = count + sumFreq.get(preSum-k);
			}
			sumFreq.put(preSum, sumFreq.getOrDefault(preSum, 0)+1);
		}
		return count;
	}

}
