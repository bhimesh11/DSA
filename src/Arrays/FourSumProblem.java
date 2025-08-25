package Arrays;

import java.util.*;
public class FourSumProblem {
	
	
	public static void main(String[] args) {
		int[] arr =  {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
		int target =9;
		//List<List<Integer>> ans = fourSumBrute(arr,target);
		//List<List<Integer>> ansBetter = fourSumBetter(arr,target);
		List<List<Integer>> ansOptimal = fourSumOptimal(arr,target);
		 System.out.println("The quadruplets are: ");
	        for (List<Integer> it : ansOptimal) {
	            System.out.print("[");
	            for (int ele : it) {
	                System.out.print(ele + " ");
	            }
	            System.out.print("] ");
	        }
	        System.out.println();
	    }
	

	private static List<List<Integer>> fourSumOptimal(int[] arr, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(arr);
		for(int i =0;i<arr.length;i++)
		{
			if(i>0 && arr[i]== arr[i-1])
			continue;
		
		for(int j =i+1;j<arr.length;j++)
		{
			if(j>i+1 && arr[j]==arr[j-1])
			{
				continue;
			}
		int k = j+1; int l = arr.length-1;
		while(k<l)
		{
			long sum = arr[i] + arr[j] + arr[k] + arr[l];
			
			if(sum== target)
			{
				List<Integer> tempList = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
				list.add(tempList);
				k++;
				l--;
				while(k<l && arr[k]==arr[k-1])
				{
					k++;
				}
				while(k<l && arr[l]==arr[l+1])
				{
					l--;
				}
			}
			else if(sum<target)
			{
				k++;
				
			}
			else {
				l--;
			}
			
		}
			
		}
		
		
	}
		return list;
	}
	


	private static List<List<Integer>> fourSumBetter(int[] arr, int target) {
		
		Set<List<Integer>> st = new HashSet<List<Integer>>();
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j =i+1;j<arr.length;j++)
			{
				Set<Integer> setIntegers = new HashSet<Integer>();
				
				for(int k = j+1 ;k<arr.length;k++)
				{
					int sum = arr[i]+ arr[j]+ arr[k];
					int fourth = target-sum;
					if(setIntegers.contains(fourth))
					{
						List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],fourth);
						Collections.sort(temp);
						st.add(temp);
					}
					setIntegers.add(arr[k]);
				}
			}
		}
		List<List<Integer>> ans = new ArrayList<List<Integer>>(st);
		return ans;
	}


	private static List<List<Integer>> fourSumBrute(int[] arr, int target) {
		
		Set<List<Integer>> st = new HashSet();
		for(int i =0;i<arr.length;i++)
		{
			for(int j =i+1;j<arr.length;j++)
			{
				for(int k = j+1;k<arr.length;k++)
				{
					for(int l = k+1;l<arr.length;l++)
					{
						int sum = arr[i]+arr[j]+arr[k]+arr[l];
						
						if(target==sum)
						{
							List<Integer> temp = new ArrayList<Integer>();
							temp.add(arr[i]);
							temp.add(arr[j]);
							temp.add(arr[k]);
							temp.add(arr[l]);
							temp.sort(null);
							st.add(temp);
						}
						
					}
				}
			}
		}
		List<List<Integer>> ans = new ArrayList<List<Integer>>(st);
		return ans;
	}

}
