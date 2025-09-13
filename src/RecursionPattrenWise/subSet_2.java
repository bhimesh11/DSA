package RecursionPattrenWise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class subSet_2 {
	
	
	public static void main(String[] args) {
		int[] nums = {1,2,2};
		List<String> ans = findsubsets(nums);
		for(String it: ans)
		{
			System.out.print(it + " ");
		}
		System.out.println();
	}

	private static List<String> findsubsets(int[] nums) {
		List<String> ans = new ArrayList<>();
		List<Integer> res = new ArrayList<>();
		HashSet<String> hashset = new HashSet<>();
		findSubs(0,nums,res,hashset);
		for(String it: hashset)
		{
			ans.add(it);
		}
		return ans;
	}

	private static void findSubs(int i, int[] nums, List<Integer> res, HashSet<String> hashset) {
	
		if(i ==nums.length)
		{
			Collections.sort(res);
			hashset.add(res.toString());
			return;
		}
		res.add(nums[i]);
		findSubs(i+1, nums, res, hashset);
		res.remove(res.size()-1);
		findSubs(i+1, nums, res, hashset);
	}

}
