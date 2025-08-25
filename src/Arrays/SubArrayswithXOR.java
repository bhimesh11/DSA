package Arrays;

import java.util.HashMap;

public class SubArrayswithXOR {
	
	
	public static void main(String[] args) {
		
		int [] arr ={4, 2, 2, 6, 4};
		int k =6;
		int result = findXORwithBrute(arr,k);
		int resultBetter = findXORwithBetter(arr,k);
		int resultOptimal = findXORwithOptimal(arr,k);
		System.out.println("Result for brute "+result);
		System.out.println("Result for better "+resultBetter);
		System.out.println("Result for Optimal "+ resultOptimal);
	}

	private static int findXORwithOptimal(int[] arr, int k) {
		int xr =0;
		int count =0;
		
		HashMap<Integer, Integer> hash = new HashMap<>();
		hash.put(xr, 1);
		
		for(int i =0;i<arr.length;i++)
		{
			xr = xr ^ arr[i];
			
			int x = xr^k;
			
			if(hash.containsKey(x))
			{
				count = count + hash.get(x);
			}
			if(hash.containsKey(xr))
			{
				hash.put(xr, hash.get(xr)+1);
			}
			else
			{
				hash.put(xr, 1);
			}
			
		}
		return count;
	}

	private static int findXORwithBetter(int[] arr, int k) {
		int count =0;
		
		for(int i =0;i<arr.length;i++)
		{
			int xor = 0;
			for(int j =i;j<arr.length;j++)
			{
			xor = xor^arr[j];
			if(xor==k)
			{
				count++;
			}
			}
			
		}
		return count;
	}

	private static int findXORwithBrute(int[] arr, int k) {
		int count =0;
		for(int i =0;i<arr.length;i++)
		{
			for(int j =i;j<arr.length;j++)
			{
				int xor =0;
				
				for(int s =i;s<=j;s++)
				{
					xor = xor^arr[s];
				}
				if(xor==k)
				{
					count++;
				}
			}
		}
		return count;
	}

}
