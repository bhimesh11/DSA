package BinarySearch;

public class FirstAndLastOccurance {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, 4, 4, 5, 6};
		int target = 4;
		int findFirstOccurance = findFirstOccurance(arr,target);
		int findSecondOccurance = findSecondOccurance(arr,target);
		System.out.println("First occurancre in the array is " + findFirstOccurance + " " + " Last occurance in the array is "+ findSecondOccurance);
		
	}

	private static int findSecondOccurance(int[] arr, int target) {
		int low =0;
		int high = arr.length-1;
		int result =-1;
		while(low<=high)
		{
			int mid = low + (high-low)/2;
			if(arr[mid]==target)
			{
				result = mid;
				low = mid +1 ;
			}else if(target<arr[mid])
			{
				high = mid -1;
			}else {
				low = mid +1;
			}
		}
		return result;
	}

	private static int findFirstOccurance(int[] arr, int target) {
	
		int low =0;
		int high = arr.length-1;
		int result =-1;
		while(low<=high)
		{
			int mid = low + (high-low)/2;
			if(arr[mid]==target)
			{
				result = mid;
				high = mid-1;
			}
			else if (target<arr[mid])
			{
				high = mid-1;
				
			}else {
				low = mid +1;
			}
		}
		return result;
	}
}
