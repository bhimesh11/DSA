package sorting;

public class Insertion_sort {

	
	public static void main(String[] args) {
		int[] arr =  {13,46,24,52,20,9};
		printarray(arr);
		int[] arr2 = insertion_sort(arr);
		printarray(arr2);
	}
	private static int[] insertion_sort(int[] arr) {
		for(int i=0;i<=arr.length-1;i++)
		{
			int j =i;
			while(j>0 && arr[j-1]>arr[j])
			{
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
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
