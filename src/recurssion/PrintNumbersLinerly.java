package recurssion;

public class PrintNumbersLinerly {
	
	public static void main(String[] args) {

		callfunction(4,0);
		System.out.println("---------------------------------");
		callfunctioninReverse(4);
	}

	private static void callfunctioninReverse(int i) {
		if(i==0)
		{
			return; 
		}
		else
		{
			System.out.println(i);
			callfunctioninReverse(i-1);
		}
		
	}

	private static void callfunction(int i, int j) {
		
		if(i<j)
		{
			return ;
		}
		
		System.out.println(j);
		callfunction(i, j+1);
		
	}

}
