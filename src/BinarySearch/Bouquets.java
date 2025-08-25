package BinarySearch;

public class Bouquets {
	
	public static void main(String[] args) {
	
		  int[] arr =  {1, 10, 3, 10, 2};
	        int k = 2;
	        int m = 3;
	        int ans = roseGarden(arr, k, m);
	        if (ans == -1)
	            System.out.println("We cannot make m bouquets.");
	        else
	            System.out.println("We can make bouquets on day " + ans);
	    
	}

	private static int roseGarden(int[] arr, int k, int m) {
		int low =0;
		int high =0;
		int ans =-1;
		for(int day: arr)
		{
			high = Math.max(high,day);
		}
		while(low<=high)
		{
			int mid = (low + high)/2;
			
			int getNoofBouquets = getNumberOfbouqutes(arr,mid,k,m);
			
			if(getNoofBouquets>=m)
			{
				ans = mid;
				high = mid-1;
				
			}else {
				low = mid+1;
			}
					
		}
		return ans;
	}

	private static int getNumberOfbouqutes(int[] arr, int mid, int k, int m) {
		
		int count =0;
		int noofbouquets=0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]<=mid)
			{
				count++;
			}else {
				count=0;
			}
			if(count==k)
			{
				noofbouquets++;
				count=0;
			}
		}
		return noofbouquets;
	}
	

}
