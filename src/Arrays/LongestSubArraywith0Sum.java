package Arrays;
import java.util.*;

public class LongestSubArraywith0Sum {
	
	public static void main(String[] args) {
		
		int[] arr =  {9, -3, 3, -1, 6, -5};
		int target =0;
		int result = findNumberOfSubArray(arr,target);
		System.out.println(result);
		List<int[]> zeroSumSubArrays = findZeroSumSubArray(arr);
		for(int[] nums : zeroSumSubArrays)
		{
			System.out.println(Arrays.toString(nums));
		}
	}

	private static int findNumberOfSubArray(int[] arr,int k ) {
		
		int sum=0;
		int maxLen =0;
		HashMap<Integer, Integer>hash = new HashMap<Integer, Integer>();
		for(int i =0;i<arr.length;i++)
		{
			sum = sum + arr[i];
			
			if(sum==k)
			{
				maxLen = i+1;
			}
			if(hash.containsKey(sum))
			{
				maxLen = Math.max(maxLen, i-hash.get(sum));
			}
			else
			{
				hash.put(sum, i);
			}
		}
		return maxLen;
	}

	private static List<int[]> findZeroSumSubArray(int[] arr) {
		
		Map<Integer, List<Integer>> hash = new HashMap<Integer, List<Integer>>();
		List<int[]> numberList = new ArrayList<int[]>();
		
		hash.put(0, new ArrayList<Integer>());
		hash.get(0).add(-1);
		
		int sum =0;
		
		for(int i =0;i<arr.length;i++)
		{
			sum = sum + arr[i];
			if(hash.containsKey(sum))
			{
				for(int numbers : hash.get(sum))
				{
					numberList.add(Arrays.copyOfRange(arr, numbers+1, i+1));
				}
			}
			hash.putIfAbsent(sum, new ArrayList<Integer>());
			hash.get(sum).add(i);
		}
		return numberList;
	}

}
