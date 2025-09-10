package Strings;

public class atoi {
	
	
	
	public static void main(String[] args) {
		String s  = "4193 with words";
		//System.out.println(conversion(s));
		System.out.println(conversionRevesion(s));
	}
	
	
	private static int conversionRevesion(String s) {
		s = s.trim();
		if(s.length()==0)
			
		{
			return 0;
		}
		int i =0;
		int num =0;
		int sign=1;
		int n = s.length();
		if(s.charAt(i)== '-' || s.charAt(i)== '+')
		{
			sign = s.charAt(i) ==-1?-1:1;
			i++;
		}
		while(i<n && Character.isDigit(s.charAt(i)))
		{
			num = num*10 + (s.charAt(i)-'0');
			if(num * sign >Integer.MAX_VALUE)
			{
				return Integer.MAX_VALUE;
			}
			
			if(num * sign < Integer.MIN_VALUE)
			{
				return Integer.MIN_VALUE;
			}
			i++;
		}
		return num* sign;
	}


	public static int conversion(String s)
	{
		s = s.trim();
		if(s.length()==0)
		{
			return  0;
		}
		int i =0;
		int num =0;
		int sign =1;
		int n =s.length();
		if(s.charAt(i)=='-' || s.charAt(i)== '+')
		{
			sign = (s.charAt(i)=='-' )?-1:1;
			i++;
		}
		while(i<n && Character.isDigit(s.charAt(i)))
		{
			num = num*10+(s.charAt(i)-'0');
			
			if(num * sign >Integer.MAX_VALUE)
			{
				return Integer.MAX_VALUE;
			}
			
			if(num * sign < Integer.MIN_VALUE)
			{
				return Integer.MIN_VALUE;
			}
			
			i++;
		}
		return sign * num;
	}

}
