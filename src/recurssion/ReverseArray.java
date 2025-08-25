package recurssion;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr  = {10,20,30,40,50,60};
		printArray(arr);
		reverseArray(arr,0,arr.length-1);
		printArray(arr);
	}

	private static void reverseArray(int[] arr, int i, int j) {
		
		if(i>=j)
		{
			return ;
		}
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j] = temp;
		
		reverseArray(arr, i+1, j-1);
	}

	private static void printArray(int[] arr) {
		for(int num:arr)
		{
			System.out.print(num + " ");
		}
		System.out.println();
		
	}

}
