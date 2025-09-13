package RecursionPattrenWise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubsetSum {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(2);
		arr.add(1);
		int index =0;
		int sum =0;
		int n = arr.size();
		ArrayList<Integer> storesets = new ArrayList<>();
		ArrayList<Integer> subSets = sumSubsets(index , sum,arr,n,storesets);
		Collections.sort(subSets);
		for(Integer k : subSets)
		{
			System.out.print(k + " ");
		}
		System.out.println();
	}

	private static ArrayList<Integer> sumSubsets(int index, int sum, ArrayList<Integer> arr, int n,
			ArrayList<Integer> storesets) {
		//base condition 
		if(index==n)
		{
			storesets.add(sum);
			return storesets;
		}
		sumSubsets(index+1, sum+arr.get(index), arr, n, storesets);
		 sumSubsets(index+1, sum, arr, n, storesets);
		 return storesets;
	}

}
