package RecursionPattrenWise;

public class GoodNumbers {
	
	private  int mod = 1000000007;
	
	public static void main(String[] args) {
		int n =4;
		int goodNumber = findGoofNumber(n);
		System.out.println(goodNumber);
	}
	private static int findGoofNumber(int n) {
		// TODO Auto-generated method stub
		 return (int)((doBinaryExponentiation(4, n / 2) * doBinaryExponentiation(5, n - n / 2)) % 1000000007 );
	}
	private static int doBinaryExponentiation(int i, int j) {
		
		int res = 1;
		
		while(j>0)
		{
			if(j%2==1)
			{
					res = (res * i)%1000000007;
			}

				i = (i*i)%1000000007;
				j = j/2;
		}
		return res;
	}

}
