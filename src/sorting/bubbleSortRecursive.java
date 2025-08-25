package sorting;

public class bubbleSortRecursive {

	public static void main(String[] args) {
		int[] arr = {13,46,24,52,20,9};
		System.out.println("Before sorting:");
		printarray(arr);
		System.out.println("After sorting:");
		bubbleSortRecursive(arr, arr.length);
		printarray(arr);
	}

	private static void bubbleSortRecursive(int[] arr, int length) {

		if (length == 1) {
			return;
		}
		bubbleSortHelper(arr, 0, length);
		bubbleSortRecursive(arr, length - 1);
	}

	private static void bubbleSortHelper(int[] arr, int i, int length) {

		if (i == length - 1)
		{
			return;
		}
		if (arr[i] > arr[i + 1]) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		bubbleSortHelper(arr, i + 1, length);
	}

	private static void printarray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();

	}
}
