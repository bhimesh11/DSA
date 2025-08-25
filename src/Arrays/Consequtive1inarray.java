package Arrays;

public class Consequtive1inarray {
	
	public static void main(String[] args) {
		int[] prices  = {1, 1, 0, 1, 1, 1};
		int maxNumber = findconsequitive(prices);
		System.out.println("Number of time repeted "+ maxNumber);
	}

	private static int findconsequitive(int[] prices) {
		
		int count =0;
		int maxcount =0;
		
		for(int i =0;i<prices.length;i++)
		{
			if(prices[i]==1)
			{
				count++;
				maxcount = Math.max(maxcount, count);
			}
			else {
				count =0;
			}
		}
		return maxcount;
	}
	


}
