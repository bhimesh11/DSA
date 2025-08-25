package BinarySearch;

public class SearchThePosition {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,7};
		int target =6;
		int pos = findAndSearch(arr,target);
		System.out.println("Position to inserted at the index " + pos);
		int[] newArray = new int[arr.length+1];
		for(int i =0;i<pos;i++)
		{
			newArray[i] = arr[i];
		}
		newArray[pos] = target;
		
		for(int i = pos ; i<arr.length;i++)
		{
			newArray[i+1] = arr[i];
		}
		for(int nums: newArray)
		{
			System.out.print( nums + " ");
		}
		System.out.println("");
	}

	private static int findAndSearch(int[] arr, int target) {
		int low =0;
		int high = arr.length-1;
		int ans = arr.length;
		
	while(low <= high)
	{
		int mid = (low + high)/2;
		if(arr[mid]>= target)
		{
			ans = mid;
			high = mid-1;
		}else {
			low = mid +1;
		}
	}
	return ans;
	}

}
