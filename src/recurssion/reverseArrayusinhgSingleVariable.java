package recurssion;

public class reverseArrayusinhgSingleVariable {
	
	public static void main(String[] args) {
		int[] arr  = {10,20,30,40,50,60};
		printArray(arr);
		reverseArray(arr,0);
		printArray(arr);
		
	}

	private static void reverseArray(int[] arr, int i) {
		
		int n = arr.length;
		
		if(i>=n/2)
		{
			return;
		}
		int temp = arr[i];
		arr[i] = arr[n-i-1];
		arr[n-i-1] = temp;
		reverseArray(arr, i+1);
 		
	}

	private static void printArray(int[] arr) {
		for(int num: arr)
		{
			System.out.print(num + " ");
		}
		System.out.println();
		
	}

}
