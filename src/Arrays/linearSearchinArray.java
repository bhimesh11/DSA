package Arrays;

public class linearSearchinArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int k = 6;
		int searchNum = findNum(arr,k);
		if(searchNum==0)
		{
			System.out.println("Number not found");
		}else {
			System.out.println("Number found" +searchNum);
		}
		
	}

	private static int findNum(int[] arr, int k) {
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==k)
			{
				return i;
			}
		}
		return 0;
	}

}
