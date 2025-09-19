package RecursionPattrenWise;

import java.util.ArrayList;
import java.util.List;

public class combinationsum3 {
	
	public static void main(String[] args) {
		int k = 2;
		int n = 7;
		List<List<Integer>> ls = combinationSum3(k, n);
		
		System.out.println("Combinations are: " + ls);
		
//		for (int i = 0; i < ls.size(); i++) {
//			for (int j = 0; j < ls.get(i).size(); j++) {
//				System.out.print(ls.get(i).get(j) + " ");
//			}
//			System.out.println();
//		}
	

}

	private static List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> subset = new ArrayList<>();
		backtrack(1,k,0,n,subset,ans);
		return ans;
	}

	private static void backtrack(int i, int k, int sumTillNow, int n, List<Integer> subset,
			List<List<Integer>> ans) {
		if(sumTillNow>n)
		{
			return;
		}
		if(k==0)
		{
			if(sumTillNow==n)
			{
				ans.add(new ArrayList<>(subset));
			
			}
			return ;
		}
		
		if(i ==10)
		{
			return;
		}
		
		sumTillNow = sumTillNow+i;
		subset.add(i);
		backtrack(i+1, k-1, sumTillNow, n, subset, ans);
		sumTillNow = sumTillNow-i;
		subset.remove(subset.size()-1);
		backtrack(i+1, k, sumTillNow, n, subset, ans);
		
	}

	
		
	}
