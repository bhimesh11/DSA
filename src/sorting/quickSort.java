package sorting;

public class quickSort {
	
	public static void main(String[] args) {
		
		int [] arr = {4,1,7,9,3};
		printarray(arr);
		quicksortarray(arr,0,arr.length-1);
		 printarray(arr);
	}
	
	private static void quicksortarray(int[] arr, int low, int high) {
		
		System.out.println("Low in quick sortarray method " + low);
		System.out.println("High in quick sortarray method " + high);
		
		if(low<high)
		{
			int pi = partition(arr,low,high);
			System.out.println("pivot index genrated " + pi);
			quicksortarray(arr, low, pi-1);
			quicksortarray(arr, pi+1, high);
			
		}
		
	
	
		
	}

	private static int partition(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		int i = low - 1;
		System.out.println("Low in partition method " +low);
		System.out.println("High in partition method " +high);
		System.out.println("pivot in partition method " +pivot);
		
		for(int j = low ; j<high;j++)
		{
			if(arr[j]<= pivot)
			{
				System.out.println("current element "+ arr[j]);
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println("after itertion");
		printarray(arr);
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		System.out.println("i befor incrementing " + i);
		printarray(arr);
		return i+1;
		
	}

	private static void printarray(int[] arr) {
		for(int num:arr)
		{
			System.out.print(num + " ");
		}
		System.out.println();
		
	}

}
