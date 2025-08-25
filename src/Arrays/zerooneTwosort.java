package Arrays;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

import recurssion.PrintnameNtimes;

public class zerooneTwosort {
	
	public static void main(String[] args) {
		int[]arr = {2,0,2,1,1,0};
		//brutesortAlgo(arr,0,arr.length-1);
		DutchNationalFlagAlgo(arr);
		printArray(arr);
		
	}

	private static void DutchNationalFlagAlgo(int[] arr) {
	
		int low = 0, mid =0,high = arr.length-1;
		
		while(mid<=high)
		{
			switch(arr[mid])
			{
			case 0:
				swap(arr,low,mid);
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(arr,mid,high);
				high--;
				break;
			}
		}
		
		
	}

	private static void swap(int[] arr, int mid, int high) {
		int temp = arr[mid];
		arr[mid] = arr[high];
		arr[high] = temp;
		
	}

	private static void printArray(int[] arr) {
		
		for(int nums:arr)
		{
			System.out.print(nums + " ");
		}
		System.out.println();
	}

	private static void brutesortAlgo(int[] arr, int low, int high) {
		
		if(low>=high)
		{
			return;
		}
	
		int mid = (low + high)/2;
		brutesortAlgo(arr, low, mid);
		brutesortAlgo(arr, mid+1, high);
		bruteMergeArary(arr,low,mid,high);
		
		
	}

	private static void bruteMergeArary(int[] arr, int low, int mid, int high) {
		ArrayList<Integer> tempList = new ArrayList();
		int left = low;
		int right = mid+1;
		
		while(left<=mid && right<=high)
		{
			if(arr[left]<=arr[right])
			{
				tempList.add(arr[left]);
				left++;
			}
			else {
				tempList.add(arr[right]);
				right++;
			}
		}
		while(left<=mid)
		{
			tempList.add(arr[left]);
			left++;
		}
		while(right<=high)
		{
			tempList.add(arr[right]);
			right++;
		}
		
		for(int i =0;i<tempList.size();i++)
		{
			arr[low +i] =tempList.get(i);
		}
		
	}

}
