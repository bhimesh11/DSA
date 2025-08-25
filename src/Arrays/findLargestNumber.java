package Arrays;

import java.util.Arrays;

public class findLargestNumber {
	
	public static void main(String[] args) {
		int[] arr = {2,5,1,3,0};
		int number = findLargest(arr); 
		System.out.println("Normal approach: " +number);
		int numberapproach2 = findLargestapproach2(arr); 
		System.out.println("Normal approach2: " +numberapproach2);
		int numberUsingJava8 = numberUsingJava8app(arr); 
		System.out.println("Java8 approach: " +numberUsingJava8);
		int numberUsingArrays = findLargesgtusingArrays(arr);
		System.out.println("sort function " + numberUsingArrays);
		
	}

	private static int numberUsingJava8app(int[] arr) {
		return  Arrays.stream(arr).max().orElseThrow(() -> new RuntimeException("Empty Array"));
		
	}

	private static int findLargestapproach2(int[] arr) {
		 int max = Integer.MIN_VALUE;
	 for(int i = 0;i<arr.length;i++)
	 {
		
		 if(arr[i]>max)
		 {
			 max = arr[i];
		 }
	 }
	 return max;
	}

	private static int findLargesgtusingArrays(int[] arr) {
		
		Arrays.sort(arr);
		return arr[arr.length-1];
	}

	private static int findLargest(int[] arr) {
		int max =0;
	for(int i =0;i<=arr.length-1;i++)
		{
			if(arr[i] > max)
			{
				 max = arr[i+1];
			}
		}
		return max;
	}

}
