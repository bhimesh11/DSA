package Arrays;

import java.util.*;

public class arrayInSpriralMatrix {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		ArrayList<Integer> list = printArrayInSpiral(arr);
		System.out.println(list);
	}

	private static ArrayList<Integer> printArrayInSpiral(int[][] arr) {

		int n = arr.length;
		int top = 0;
		int bottom = arr.length - 1;
		int left = 0;
		int right = arr.length - 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (top <= bottom && left <= right) {
			for (int i = left; i <= right; i++) {
				list.add(arr[top][i]);
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				list.add(arr[i][right]);
			}
			right--;

			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					list.add(arr[bottom][i]);

				}
				bottom--;
			}

			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					list.add(arr[i][left]);
				}
				left++;
			}

			
		}
		return list;
	}
}
