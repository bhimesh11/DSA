package BinarySearch;

public class KoKoEatingBananas {
	
	public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }

	private static int minimumRateToEatBananas(int[] v, int h) {
		int low = 1;
		int high = findMax(v);
		
		while(low <= high)
		{
			int mid = (low + high)/2;
			int totalHours= calculateTotalHours(v,mid);
			if(totalHours<=h)
			{
			high = mid-1;
		
			}else {
				low = mid+1;
			}
		}
		return low;
	}

	private static int calculateTotalHours(int[] v, int hourly) {
		int totalH =0;
		for(int i =0;i<v.length;i++)
		{
			totalH += Math.ceil((double)(v[i]) / (double)(hourly));
		}return totalH;
	}

	private static int findMax(int[] v) {
		int max = Integer.MIN_VALUE;
		for(int i =0;i<v.length;i++)
		{
			max = Math.max(max, v[i]);
		}
		return max;
	}

}
