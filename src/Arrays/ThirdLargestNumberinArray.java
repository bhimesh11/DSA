package Arrays;

public class ThirdLargestNumberinArray {
	

	public static void main(String[] args) {
		int [] arr = {1,2,4,7,7,5};
		//int thirdLarge = findThirdLargeTraditional(arr);
		//System.out.println(thirdLarge);
		int smallest  = findSmallest(arr);
		System.out.println(smallest);
	//	int thirdLargejava8Approach = findThirdLargestjava8Approach(arr);
		//System.out.println(thirdLargejava8Approach);
		
		}

private static int findSmallest(int[] arr) {
	 
	int smallest = Integer.MAX_VALUE;
	int secondSmallest = Integer.MAX_VALUE;
	
	for(int num: arr)
	{
		if(num<smallest)
		{
			secondSmallest = smallest;
			smallest = num;
		
		}
		else if(num>smallest && num < secondSmallest)
		{
			secondSmallest = num;
		}
	}
	return secondSmallest;
	}

//	private static int findThirdLargestjava8Approach(int[] arr) {
//		
//	}

	private static int findThirdLargeTraditional(int[] arr) {
	
		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		
		for(int num:arr)
		{
			if(num==largest||num==second_largest||num==thirdLargest)
			{
				continue;
			}
			if(num>largest)
			{
				thirdLargest = second_largest;
				second_largest=largest;
				largest=num;
			}
			else if(num > second_largest)
			{
				thirdLargest = second_largest;
				second_largest = num;
			}
			else if(num > thirdLargest)
			{
				thirdLargest = num;
			}
		}
		return thirdLargest;
	}
	

}
