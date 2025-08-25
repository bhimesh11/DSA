package Arrays;

import java.util.*;

public class LongestSubSequence {
	
	
	public static void main(String[] args) {
		
		int[] arr = {100,200,1,3,2,4};
		int lenght = longestConsecutive(arr);
		System.out.println(lenght);
		
		
	}

	private static int longestConsecutive(int[] arr) {
		Set<Integer> set = new HashSet<>();
		
		for(int nums:arr)
		{
			set.add(nums);
		}
		int longest =0;
		for(int numbers:set)
		{
			if(!set.contains(numbers-1))
			{
				int current = numbers;
				int count =1;
			
			while(set.contains(current+1))
			{
				current++;
				count++;
			}
longest = Math.max(longest, count);
		}
				
	}
		return longest;
	}
}
