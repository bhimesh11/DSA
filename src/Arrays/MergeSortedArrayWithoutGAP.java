package Arrays;

import java.util.Arrays;

public class MergeSortedArrayWithoutGAP {

	public static void main(String[] args) {

		int[] arr1 = { 1, 4, 8, 10 };
		int[] arr2 = { 2, 3, 9 };
		// SortinBrute(arr1, arr2);
		//sortInOptimal1(arr1, arr2);
		sortInOptimal(arr1,arr2);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\narr2[] = ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

	}

	private static void sortInOptimal(int[] arr1, int[] arr2) {
		
		int len = arr1.length + arr2.length;
		int gap = (len /2) + (len % 2);
		while(gap>0)
		{
			int left =0;
			int right = left+gap;
			while(right<len)
			{
				//case-1 left is in arr1 right is arr2
				if(left<arr1.length && right>=arr1.length)
				{
					swapIfGreater(arr1,arr2,left,right-arr1.length);
				}
				//case-2 left and right are in arr2
				else if(left>=arr1.length) {
					swapIfGreater(arr2,arr2,left-arr1.length,right-arr1.length);
				}
				else {
				swapIfGreater(arr1,arr1,left,right);
			}
			left++;
			right++;
		}
		if(gap==1)
		{
			break;
		}
		else {
			gap =(gap/2)+(gap%2);
		}
		
	}
	}

	 public static void swapIfGreater(int[] arr1, int[] arr2, int ind1, int ind2) {
	        if (arr1[ind1] > arr2[ind2]) {
	            int temp = arr1[ind1];
	            arr1[ind1] = arr2[ind2];
	            arr2[ind2] = temp;
	        }
	    }
	private static void sortInOptimal1(int[] arr1, int[] arr2) {

		int left = arr1.length - 1;
		int right = 0;
		while (left >= 0 && right < arr2.length - 1) {
			if (arr1[left] > arr2[right]) {
				int temp = arr1[left];
				arr1[left] = arr2[right];
				arr2[right] = temp;
				left--;
				right++;
			} else {
				break;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	}

	private static void SortinBrute(int[] arr1, int[] arr2) {

		int[] arr3 = new int[arr1.length + arr2.length];

		int left = 0;
		int right = 0;
		int index = 0;

		while (left < arr1.length && right < arr2.length) {
			if (arr1[left] < arr2[right]) {
				arr3[index] = arr1[left];
				left++;
				index++;

			} else {
				arr3[index] = arr2[right];
				right++;
				index++;
			}

		}
		while (left < arr1.length) {
			arr3[index] = arr1[left];
			index++;
			left++;
		}
		while (right < arr2.length) {
			arr3[index] = arr2[right];
			right++;
			index++;
		}
		for (int i = 0; i < arr1.length + arr2.length; i++) {
			if (i < arr1.length) {
				arr1[i] = arr3[i];
			} else {
				arr2[i - arr1.length] = arr3[i];
			}
		}

	}

}
