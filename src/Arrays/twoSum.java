package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class twoSum {
	
	public static void main(String[] args) {
	int [] arr = {2,6,5,8,11};
	int target =14;
	int N = arr.length;
	ArrayList<Integer> numsbers = findSolution(arr,target);
Boolean varient2 = findSolutionvarient1(arr,target);
System.out.println(varient2);


if(varient2)
{
	System.out.println(numsbers);
}
else {
	System.out.println("NA");
}
List<Integer> hashMapApproach = FindOptimalSolutions(arr,target);
System.out.println("Hash map Approachm " + hashMapApproach);
	}

	private static List<Integer> FindOptimalSolutions(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap();
		
		for(int i =0;i<arr.length;i++)
		{
			int compleemt = target - arr[i];
			if(map.containsKey(compleemt))
			{
				return Arrays.asList(map.get(compleemt),i);
			}
			map.put(arr[i], i);
		}
		return new ArrayList<Integer>();
	}

	private static Boolean findSolutionvarient1(int[] arr, int target) {
		Boolean isThere = false;
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j=i+1 ;j<arr.length;j++)
			{
				if(arr[i] + arr[j]==target)
				{
					isThere = true;
				}
			}
		}
		return isThere;
		
	}

	private static ArrayList<Integer> findSolution(int[] arr, int target) {
	
		ArrayList<Integer> result  = new ArrayList();
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j=i+1 ;j<arr.length;j++)
			{
				if(arr[i] + arr[j]==target)
				{
					result.add(i);
					result.add(j);
					
				}
			}
		}
		return result;
	}

}




