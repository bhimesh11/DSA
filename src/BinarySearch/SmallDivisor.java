package BinarySearch;

public class SmallDivisor {
	
	public static void main(String[] args) {
		  int[] arr = {1, 2, 3, 4, 5};
	        int limit = 8;
	        int ans = smallestDivisor(arr, limit);
	        System.out.println("The minimum divisor is: " + ans);
	}

	private static int smallestDivisor(int[] arr, int limit) {
	
		int max = Integer.MIN_VALUE;
		for(int number: arr)
		{
			max = Math.max(max,number);
		}
		int low =1;
		int high = max;
		
		while(low<=high)
		{
			int mid = (low +high)/2;
			
			if(sumByD(arr,mid)<=limit)
			{
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return low;
	}

	private static int sumByD(int[] arr, int mid) {
	int n = arr.length;
	int sum =0;
	for(int i =0;i<arr.length;i++)
	{
		 sum += Math.ceil((double)(arr[i]) / (double)(mid));
	}
	return sum;
	}

}
