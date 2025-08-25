package BinarySearch;

public class KthMissing {
	
public static void main(String[] args) {
	int[] vec = {4, 7, 9, 10};
    int n = 4, k = 4;
    int ans = missingK(vec, n, k);
    System.out.println("The missing number is: " + ans);
}

private static int missingK(int[] vec, int n, int k) {
	int low = 0;
	int high = vec.length-1;
	while(low<=high)
	{
		int mid = (low + high)/2;
		int missing = vec[mid] - (mid+1);
		if(missing<k)
		{
			low = mid+1;
		}else {
			high = mid-1;
		}
	}
	return k+high+1;
}

}
