package sorting;

import java.util.ArrayList;

public class Mergesort {
	
	public static void main(String[] args) {
		int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
		printarray(arr);
		int n = arr.length;
		 Mergesortme(arr,0,n-1);
		 printarray(arr);
	}
	
	private static void Mergesortme(int[] arr, int low, int high) {
	
		if(low >= high)
		{
			return;
		}
		int mid = (low + high)/2;
		Mergesortme(arr,low,mid);
		Mergesortme(arr, mid+1, high);
		MergeArray(arr, low,mid, high);
		
	}

	private static void MergeArray(int[] arr, int low, int mid, int high) {
		ArrayList<Integer> tempList = new ArrayList();
		int left = low;
		int right = mid+1;
		
		while(left <= mid && right <= high)
		{
			if(arr[left]<=arr[right])
			{
				tempList.add(arr[left]);
				left++;
			}
			else
			{
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
			System.out.println(low);
			arr[low + i] = tempList.get(i);
		}
		
	}

	private static void printarray(int[] arr) {
		for(int num:arr)
		{
			System.out.print(num + " ");
		}
		System.out.println();
		
	}

}
