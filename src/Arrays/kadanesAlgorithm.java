package Arrays;

public class kadanesAlgorithm {

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int result = findOutput(arr);
		System.out.println("Result is " + result);
//		int[] subarray = findOutputOfsubarray(arr);
//		for (int nums : subarray) {
//			System.out.print(nums + " ");
//		}

	}


	private static int findOutput(int[] arr) {

		int currentSum = arr[0];
		int maxSum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}

}
