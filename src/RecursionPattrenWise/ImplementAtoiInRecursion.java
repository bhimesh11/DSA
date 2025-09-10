package RecursionPattrenWise;

public class ImplementAtoiInRecursion {

	public static void main(String[] args) {
		System.out.println(atoi("123456"));
	}

	private static int atoi(String s) {
		s = s.trim();
		if(s.length()==0)
		{
			return 0;
		}
		int sign =1;
		int index =0;
		if(s.charAt(0)=='-')
		{
			sign = -1;
			index++;
		}else if(s.charAt(0) == '+')
		{
			index++;
		}
		return atoiHelper(s, index, 0);
		
	}

	private static int atoiHelper(String string, int index, int i) {
	if(index>=string.length() || !Character.isDigit(string.charAt(index)))
	{
		return i;
	}
	int digit = string.charAt(index) - '0';
	return atoiHelper(string, index+1, i*10+digit);
	}
}
