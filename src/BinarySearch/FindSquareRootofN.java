package BinarySearch;

public class FindSquareRootofN {

	public static void main(String[] args) {
		
		int n = 36;
		int ans = findSqrtofNumber(n);
		 System.out.println("The floor of square root of " + n + " is: " + ans);
	}

	private static int findSqrtofNumber(int number) {
		int low =1;
		int high =number;
		int ans =-1;
		while(low <= high)
		{
			int mid = (low + high)/2;
			
			if(mid * mid <= number)
			{
				ans = mid;
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return ans;
	}
}

