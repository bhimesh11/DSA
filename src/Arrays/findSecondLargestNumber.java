package Arrays;

import java.util.Arrays;

public class findSecondLargestNumber {
	
	public static void main(String[] args) {
		int [] arr = {1,2,4,7,7,5};
		int secondLarge = findSecondLargeTraditional(arr);
		System.out.println(secondLarge);
		int java8Approach = findSecondLargestjava8Approach(arr);
		System.out.println(java8Approach);
		
		}

	private static int findSecondLargestjava8Approach(int[] arr) {
		return Arrays.stream(arr).distinct().boxed().sorted((a,b) -> b-a).skip(2).findFirst().orElseThrow(() -> new RuntimeException("Empty array"));
	}

	private static int findSecondLargeTraditional(int[] arr) {
		
	int largest = Integer.MIN_VALUE;
	int secondLargest = Integer.MIN_VALUE;
	int thirdLargest = Integer.MIN_VALUE;
		
		for(int num:arr)
		{
		if(num>largest)
		{
			thirdLargest = secondLargest;
			secondLargest = largest;
			largest = num;
		}
		else if(num> secondLargest && num!=largest)
		{
			secondLargest = num;
		}
			//return secondLargest;
	
	}
		return secondLargest;
	}

}
