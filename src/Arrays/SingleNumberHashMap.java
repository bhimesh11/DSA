package Arrays;

import java.util.HashMap;

public class SingleNumberHashMap {
	
	public static void main(String[] args) {
		int[] arr =  {4,1,2,1,2};
		int bruteResult = findInBrute(arr);
		System.out.println();
		System.out.println("Brute result "+ bruteResult);
		int result = findSingleNumber(arr);
		System.out.println("Result is " + result);
		int resultusingxor = findUsingXOR(arr);
		System.out.println(resultusingxor);
		
	}

	private static int findUsingXOR(int[] arr) {
		
		int result =0;
		for(int num:arr)
		{
			result = result ^ num;
		}
		return result;
	}

	private static int findInBrute(int[] arr) {
	
		for(int i =0;i<arr.length;i++)
		{
			int count =0;
			int num = arr[i];
			for(int j =0;j<arr.length;j++)
			{
				if(arr[j]==num)
				{
					count++;
				}
			}
				if(count==1)
				{
					return num;
				}
			}
			
		
		return -1;
	}

	private static int findSingleNumber(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap();
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(int nums: map.keySet())
		{
			System.out.println("Key " + nums + " value is " + map.get(nums));
		}
		for(int keys:map.keySet())
		{
			System.out.println("Key is " + keys);
			if(map.get(keys)==1)
			{
				return keys;
			}
		}
		return -1;
	}
	
	
	

}
