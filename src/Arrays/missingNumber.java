package Arrays;

import java.util.HashMap;
import java.util.Map;

public class missingNumber {

	
	public static void main(String[] args) {
		
		int[] arr =  {1,2,4,5};
		int n = 5;
		//int missingNumber = findMisingNumberBruteForce(arr,n);
		//System.out.println("Missing number is " +missingNumber);
		int missingNumberFromhashMap = findMisingNumberBetterApproach(arr, n);
		System.out.println(missingNumberFromhashMap);
		int optimalSolution = findMissingOptimalSolution(arr,n);
	System.out.println(optimalSolution);
	}

	private static int findMissingOptimalSolution(int[] arr, int n) {
		
		int sumofNaturalnumber = (n *(n+1))/2;
		int result = 0;
		for(int i =0;i<n-1;i++ )
		{
			result = result + arr[i]; 
		}
		
		int finalresult = sumofNaturalnumber - result;
		
		return finalresult;
	}

	private static int findMisingNumberBetterApproach(int[] arr, int n) {
		HashMap<Integer, Boolean > maps = new HashMap();
		
		for(int num: arr)
		{
			maps.put(num, true);
		}
		for(int i =1 ;i<=n;i++)
		{
			if(!maps.containsKey(i))
			{
				return i;
			}
		}
		return -1;
	}

	private static int findMisingNumberBruteForce(int[] arr, int n) {
for(int i =1 ;i<=n;i++)
{
	int flag =0;
	
	for(int j =0;j<n;j++)
	{
		if(arr[i]==j)
		{
			flag =1;
		}
	}
	if(flag==0)
	{
		return i;
	}
}
return -1;
	}	
	
}
