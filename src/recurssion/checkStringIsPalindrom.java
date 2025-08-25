package recurssion;

public class checkStringIsPalindrom {

	
	public static void main(String[] args) {
		
		String s = "dog";
		char[] sarray = s.toCharArray();
		Boolean result = checkIfPalindorme(sarray,0);
		System.out.println(result);
		
	}

	private static Boolean checkIfPalindorme(char[] sarray, int i) {
		
		int n = sarray.length;
		if(i>=n/2)
		{
			return true;
		}
		if(sarray[i]!=sarray[n-i-1])
		{
			return false;
		}
		return checkIfPalindorme(sarray, i+1);
		
	}
	
}
