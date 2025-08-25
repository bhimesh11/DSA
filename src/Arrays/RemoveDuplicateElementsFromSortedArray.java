package Arrays;

import java.util.HashSet;
import java.util.function.IntFunction;

public class RemoveDuplicateElementsFromSortedArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,1,2,2,2,3,3};
//		Integer[] ArraywithoutDuplicates = RemoveDuplicates(arr);
//		for(Integer num:ArraywithoutDuplicates)
//		{
//			System.out.print(num + " ");
//		}
		int k = RemoveDuplicatesTraditional(arr);
	for(int i =0;i<k;i++)
	{
		System.out.print(arr[i] + " ");
	}
		
	}

	private static int RemoveDuplicatesTraditional(int[] arr) {
		int i =0;
		
		for(int j =1;j<arr.length;j++)
		{
			if(arr[i]!=arr[j])
			{
				i++;
			arr[i] = arr[j];
			System.out.println(arr[i]);
			}
		}
		
		return i+1;
			
	}

	private static Integer[] RemoveDuplicates(int[] arr) {
		
		HashSet<Integer> hashset = new HashSet();
		for(int i =0;i<arr.length;i++)
		{
			hashset.add(arr[i]);
		}
		Integer[] converted = hashset.toArray(new Integer[0]);
		return converted;
	}

}
