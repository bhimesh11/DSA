package sorting;

public class selectionsort {
	
	
public static void main(String[] args) {
	
	int[] arr = {13,46,24,52,20,9};
	printarray(arr);
	int n = arr.length;
	int[] arr2 = selectionsorting(arr,n); 
	printarray(arr2);
	
}

private static int[] selectionsorting(int[] arr,int n) {

	for(int i =0;i<=n-2;i++)
	{
		int mini = i;
		for(int j =i;j<=n-1;j++)
		{
			if(arr[j]<arr[mini])
			{
				mini =j;
			}
		}
		int temp = arr[mini];
		arr[mini] = arr[i];
		arr[i] = temp;
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
