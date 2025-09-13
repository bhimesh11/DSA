package RecursionPattrenWise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset_2optimal {

	public static void main(String[] args) {
		int[] nums = {1,2,2};
		List<List<Integer>> ansList = subsetWithDups(nums);
		System.out.println(ansList.toString().replace(",",""));
	}

	private static List<List<Integer>> subsetWithDups(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> ansList = new ArrayList<>();
		findSubSet(0,nums,new ArrayList<>(),ansList);
		return ansList;
	}

	private static void findSubSet(int index, int[] nums, List<Integer> arrayList, List<List<Integer>> ansList) {
		{
			ansList.add(new ArrayList<>(arrayList));
			for(int i =index;i<nums.length;i++)
			{
				if(i!=index && nums[i]==nums[i-1])
				{
					continue;
				}
				arrayList.add(nums[i]);
				findSubSet(index+1, nums, arrayList, ansList);
				arrayList.remove(arrayList.size()-1);
				
			}
		}
		
		
	}
}
