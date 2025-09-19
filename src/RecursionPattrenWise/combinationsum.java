package RecursionPattrenWise;

import java.util.ArrayList;
import java.util.List;

public class combinationsum {
	
	public static void main(String[] args) {
        int arr[] = {2,3,6,7};
        int target = 7;
        //Solution sol = new Solution();
        List<List<Integer>> ls = combinationSum(arr, target);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

	private static List<List<Integer>> combinationSum(int[] arr, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		findCombination(0,arr,target,ans,new ArrayList<>());
		return ans;
	}

	private static void findCombination(int i, int[] arr, int target, List<List<Integer>> ans, ArrayList arrayList) {
	
		if(i==arr.length)
		{
			if(target==0)
			{
				ans.add(new ArrayList<>(arrayList));
			}
			return;
		}
		if(arr[i]<=target)
		{
			arrayList.add(arr[i]);
			findCombination(i, arr, target-arr[i], ans, arrayList);
			arrayList.remove(arrayList.size()-1);
		}
		findCombination(i+1 , arr, target, ans, arrayList);
	}
}