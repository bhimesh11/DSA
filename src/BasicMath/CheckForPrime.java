 package BasicMath;

public class CheckForPrime {
	
	public static void main(String[] args) {
		boolean isPrime = checkPrime(11);
		if(isPrime)
		{
			System.out.println(isPrime);
		}
		else
		{
			System.out.println(isPrime);
		}
	}

	private static boolean checkPrime(int n) {
		int counter =0;
		for(int i =1;i*i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				counter++;
			
			if(n/i!=i)
			{
				counter++;
			}
			}
		}
		
		if(counter==2)
		{
			return true;
		}
		else {
		return false;
		}
	}

}
