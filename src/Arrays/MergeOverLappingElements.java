package Arrays;

import java.util.*;

public class MergeOverLappingElements {
	
	public static void main(String[] args) {
		int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
		List<List<Integer>> ans = mergeOverLappingIntervals(arr);
		for(List<Integer> it: ans)
		{
			System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
		}
		System.out.println();
		List<List<Integer>> ans2 = mergeOverLappingIntervalsOptimal(arr);
		for(List<Integer> it: ans2)
		{
			System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
		}
		System.out.println();
	}

	private static List<List<Integer>> mergeOverLappingIntervalsOptimal(int[][] arr) {
		
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] a , int[] b)
			{
			return a[0]-b[0];
			}
		});
		
		List<List<Integer>> ans = new ArrayList<>();
		
		for(int i =0;i<arr.length;i++)
		{
			if(ans.isEmpty()|| arr[i][0]>ans.get(ans.size()-1).get(1))
			{
				ans.add(Arrays.asList(arr[i][0],arr[i][1]));
			}else {
				ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1), arr[i][1]));
			}
		}
		return ans;
}

	private static List<List<Integer>> mergeOverLappingIntervals(int[][] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] a , int[] b)
			{
				return a[0]-b[0];
			}
		});
	
		List<List<Integer>> ans = new ArrayList<>();
		for(int i =0;i<arr.length;i++)
		{
			int start = arr[i][0];
			int end = arr[i][1];
			
			System.out.println(" end comparing  with " + end +" " + ans.size());
			if(!ans.isEmpty()&&  end <= ans.get(ans.size()-1).get(1))
			{
				continue;
			}
			for(int j = i+1;j<arr.length;j++)
			{
				System.out.println("arr end " + arr[1]);
				System.out.println("current starting " + arr[0]);
				if(arr[j][0]<= end)
				{
					end = Math.max(end, arr[j][1]);
				}else {
					break;
				}
			}
			System.out.println("arr start " + arr[0]);
			System.out.println("arr end " + arr[1]);
			ans.add(Arrays.asList(start ,end));
		}
		return ans;
	}

}
