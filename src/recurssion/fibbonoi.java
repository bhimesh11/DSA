package recurssion;

public class fibbonoi {
	
	public static void main(String[] args) {
		
		int number = checkFactorial(4);
		System.out.println(number);
	}

	private static int checkFactorial(int i) {
		
		if(i<=1)
		{
			return i;
		}
		int first = checkFactorial(i-1);
		int second = checkFactorial(i-2);
		return first + second;
	}

}
