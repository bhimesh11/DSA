package sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		printarray(arr);
		int n = arr.length;
		int[] arr2 = bubbleSortIterative(arr,n); 
		printarray(arr2);
	}
	
	private static int[] bubbleSortIterative(int[] arr, int n) {
		for(int i = n-1;i>=0;i--)
		{
			int didSwap = 0;
			for(int j =0;j<=i-1;j++)
			{
				if(arr[j]> arr[j+1])
				{
					int temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
					didSwap = 1; 
				}
			}
			if(didSwap ==0)
			{
				break;
			}
			
		}
		return arr;
	}

	private static void printarray(int[] arr) {
		for(int num:arr)
		{
			System.out.print(num + " ");
		}
		System.out.println();
		
	}
}
