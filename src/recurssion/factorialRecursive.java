package recurssion;

public class factorialRecursive {
	
	public static void main(String[] args) {
		callFactoriaolP(10,1);
		int factorial = callFactorialFunctional(10);
		System.out.println("Factorial " + factorial);
	}

	private static int callFactorialFunctional(int i) {
		if(i<1)
		{
			return 1;
		}
		return i * callFactorialFunctional(i-1);
	}

	private static void callFactoriaolP(int i, int j) {
		if(i==0)
		{
			System.out.println(j);
			return;
		}
		callFactoriaolP(i-1, j*i);
		
	}

}
