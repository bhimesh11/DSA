package BinarySearch;

public class NRootOfBinaryNumber {
	
	public static void main(String[] args) {
		
		int n =4; int m =69;
		int ans = NthRoot(n,m);
		System.out.println("The answer is: " + ans);
	}

	private static int NthRoot(int n, int m) {
		int low = 1;
		int high = n;
		
		while(low<=high)
		{
			int mid = (low + high)/2;
			int midn = func(mid,n,m);
			if(midn==1)
			{
				return mid;
			}
			else if(midn ==0)
			{
				low = mid+1;
			}else {
				high = mid=1;
			}
		}
		return -1;
	}

	private static int func(int mid, int n, int m) {
		int ans =1;
		for(int i=1;i<=n;i++) {
			ans = ans* mid;
			if(ans>m)
			{
				return 2;
			}
		}
		if(ans==m)
		{
			return 1;
		}else {
			return 0;
		}
	}

}
