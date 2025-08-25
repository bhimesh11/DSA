package recurssion;

public class SummationOfNnumbers {
	
	public static void main(String[] args) {
		int tracker = 0;
		callFunctionforSummationparametrized(0,5);
		int number = callFunctionforSummationfunctional(5);
		System.out.println("Functional:" + number);
	}

	private static int callFunctionforSummationfunctional(int i) {
		if(i==0)
		{
			return 0;
		}
		return i + callFunctionforSummationfunctional(i-1);
		
	}

	private static void callFunctionforSummationparametrized(int i, int j) {
		
	if(j<1)
	{
		System.out.println(i);
		return;
	}
	callFunctionforSummationparametrized(i+j, j-1);
	}

}
