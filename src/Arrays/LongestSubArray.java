package Arrays;

public class LongestSubArray {

	public static void main(String[] args) {
		int [] arr =  {1,9,2,3,5};
		int k =10;
		int maxLenght = findLengthOfSubArray(arr,k);
		System.out.println("maximum Length "  + maxLenght);
	}

	private static int findLengthOfSubArray(int[] arr, int k) {
		int left =0;
		int right =0;
		int sum =0;
		int maxLen =0;
		
		while(right<arr.length)
		{
			sum = sum + arr[right];
			
			while(sum>k)
			{
				sum = sum -arr[left];
						left++;
			}
			if(sum==k)
			{
				maxLen = Math.max(maxLen, right-left +1 );
			}
			right++;
		}
		return maxLen;
	}
}
