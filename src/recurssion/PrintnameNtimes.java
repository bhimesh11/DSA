package recurssion;

public class PrintnameNtimes {
	
	public static void main(String[] args) {
	callName("Bhimesh",5,0);
				
	}

	private static void callName(String string, int iterationValue, int currentIterarion) {
	
		
		
		if(iterationValue<currentIterarion)
		{
			return;
		}
		else {
			System.out.println(string);
			callName(string,iterationValue,currentIterarion+1);
		}
		
			}

}
