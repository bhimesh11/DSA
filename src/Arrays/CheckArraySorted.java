package Arrays;

public class CheckArraySorted {
	
	public static void main(String[] args) {
		 int[] arr = {1,100,2,3,9,4,5};
		 Boolean isSorted = issortedCheck(arr);
		 System.out.println(isSorted);
	}

	private static Boolean issortedCheck(int[] arr) {
		
		for(int i =1 ;i<arr.length;i++)
		{
			if(arr[i] < arr[i-1])
			{
				return false;
			}
		}
	return true;
	}

}
