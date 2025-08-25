package BinarySearch;import java.lang.annotation.Target;

public class BSintro {
	
	public static void main(String[] args) {
		int arr[] =  {3, 4, 6, 7, 9, 12, 16, 17};
		int target = 6;
//		int ind = iterativeApproach(arr,target);
//		  if (ind == -1)
//	            System.out.println("The target is not present.");
//	        else
//	            System.out.println("The target is at index: " + ind);
		  int Rec = RecursiveApproach(arr,target);
		  if (Rec == -1)
	            System.out.println("The target is not present.");
	        else
	            System.out.println("The target is at index: " + Rec);

		
	}

	private static int RecursiveApproach(int[] arr, int target) {
		return binarySearch(arr,0,arr.length-1,target);
	}

	private static int binarySearch(int[] arr, int low, int high, int target) {
		
		
		if(low>high)
		{
			return -1;
		}
		int mid = (low+high)/2;
		if(arr[mid]==target)
		{
			return mid;
		}
		else if(target>arr[mid])
		{
			return binarySearch(arr, mid+1, high, target);
		}
		else {
			return binarySearch(arr, low, mid-1, target);
		}
	}

	private static int iterativeApproach(int[] arr, int target) {
	 int low =0;
	 int high = arr.length-1;
	 int mid =0;
	 for(int i =0;i<arr.length;i++)
	 {
		 while(low<high)
		 {
			 
		 
		 mid = (low + high)/2;
		 if(arr[mid]==target)
		 {
			 return mid;
		 }
		 else if(target>arr[mid])
		 {
			 low = mid+1;
			 
		 }
		 else {
			 high = mid -1;
			
		 }
	 }
		
	}
	 return -1;
	}

}
