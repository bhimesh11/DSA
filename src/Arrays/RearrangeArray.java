package Arrays;

import java.util.ArrayList;

public class RearrangeArray {
	
	public static void main(String[] args) {
		int[] arr =  {1,2,-4,-5,3,4};
		int[] arrfinal = rotateArray(arr);
		for(int nums:arrfinal)
		{
			System.out.print(nums + " ");
		}
		System.out.println();
	}
	

	private static int[] rotateArray(int[] arr) {
		
		ArrayList<Integer> positives = new ArrayList<>();
		ArrayList<Integer> negitives = new ArrayList<>();
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				negitives.add(arr[i]);
			}
			else {
				positives.add(arr[i]);
			}
		}
	int k =0,p=0,l=0;
	while(p<positives.size() && l<negitives.size())
	{
		arr[k++]  = positives.get(p++);
		arr[k++] = negitives.get(l++);
		
	}
	while(p<positives.size())
	{
		arr[k++]  = positives.get(p++);
	}
	while(l<negitives.size())
	{
		arr[k++]  = negitives.get(l++);
	}
	return arr;
	}
	
	

}
