package recurssion;

public class backtrack1toN {
	
	public static void main(String[] args) {
		
		callFunction(3,3);
		System.out.println("-----------------------------------");
		callFunction1toN(1,3);
	}

	private static void callFunction1toN(int i, int j) {
	if(i>j)
		{
			return;
		}
		callFunction1toN(i+1, j);
		System.out.println(i);
		
	}

	private static void callFunction(int i, int j) {
		if(i<1)
		{
			return;
		}
		callFunction(i-1, j);
		System.out.println(i);
	}

}
