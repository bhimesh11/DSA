package Arrays;

public class ReturnMaxSubArray {
	
	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		// int result = findOutput(arr);
		// System.out.println("Result is " + result);
		int[] subarray = findOutputOfsubarray(arr);
		for (int nums : subarray) {
			System.out.print(nums + " ");
		}

	}

	private static int[] findOutputOfsubarray(int[] arr) {

		int maxi = Integer.MIN_VALUE;
		int sum = 0;
		int start = -1;
		int arrend = -1;
		int arrstart = -1;

		for (int i = 0; i < arr.length; i++) {
			if (sum == 0) {
				start = i;
			}
			sum = sum + arr[i];

			if (sum > maxi) {
				maxi = sum;
				arrstart = start;
				arrend = i;
			}

			if (sum < 0) {
				sum = 0;
			}
		}
		int[] out = new int[arrend - arrstart + 1];
		int k = 0;
		for (int i = arrstart; i <= arrend; i++)

		{

			out[k] = arr[i];
			k++;
		}
		return out;

	}


}
