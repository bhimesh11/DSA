package BasicMath;

public class FindGCDandHCF {

	
	public static void main(String[] args) {
		int number = findGCDorHDF(15,20);
		System.out.println(number);
	}

	private static int findGCDorHDF(int i, int j) {
		
		while(i>0 && j>0)
		{
			if(i>j)
			{
				i = i%j;
			}
			else {
				j = j%i;
			}
		}
		if(i==0)
		{
			return j;
		}
		else
		{
			return i;
		}
			}
}
