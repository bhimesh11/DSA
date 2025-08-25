package Arrays;

public class MovenonZerostoEnd {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 0, 2, 0, 4, 0, 5};
		bruteForceApproach(arr);
		System.out.println("");
		optimalApproach(arr);
		
	}

	private static void optimalApproach(int[] arr) {
		int j = -1; 
				for(int i =0;i<arr.length;i++)
				{
					if(arr[i]==0)
					{
						j =i;
						break;
					
					}
				}
				if(j ==-1)
				{
					return ;
				}
				for(int i=j+1;i<arr.length;i++)
				{
					if(arr[i]!=0)
					{
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						j++;
					}
				}
				printArray(arr);
	}

	private static void bruteForceApproach(int[] arr) {
		int index = 0;
		int[] temp = new int[arr.length];
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				temp[index] = arr[i];
				index++;
			}
		
		
		}
		while(index<arr.length)
		{
			arr[index++] = 0;
		}
		
		for(int i =0;i<arr.length-1;i++)
		{
			arr[i] = temp[i];
		}
		
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		
		for(int num:arr)
		{
			System.out.print(num + " ");
		}
		
	}

}
