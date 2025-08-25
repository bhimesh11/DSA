package Arrays;

public class LeftRotationByKplaces {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 2;
		int n = arr.length;
		k = k % n;
		System.out.println(" k is " +k);
		//naiveApproach(arr,k,n);
		NewArrayApproach(arr,k,n);
	

		
	}

	private static void NewArrayApproach(int[] arr, int k, int n) {
	
		int[] rotated = new int[arr.length];
		for(int i =0;i<n;i++)
		{
			int newIndex = (i-k+n)%n;
			
			rotated[newIndex] = arr[i];
		
		}
		for(int nums:rotated)
		{
			System.out.print(nums + " ");
		
		}
	}

	private static void naiveApproach(int[] arr, int k, int n ) {
		
		for (int r = 0; r < k; r++) {
			System.out.println(" R is " + r);
			System.out.println(" k is " +k);
			
			int temp = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				System.out.println(" i is " + arr[i]);
		
				arr[i] = arr[i + 1];
			}
			arr[n - 1] = temp;
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}

		
	}

}
