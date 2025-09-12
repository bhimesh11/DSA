package RecursionPattrenWise;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStrings {

	public static void main(String[] args) {
		
		int n = 3;
		List<String> binaryString = generate(n);
		System.out.println(binaryString.size());
		for(String s : binaryString)
		{
			System.out.print(s);
			System.out.println();
		}
		
	}

	private static ArrayList<String> generate(int n) {
	ArrayList<String> ans = new ArrayList<>();
	if(n<=0)
	{
		ans.add("");
		return ans;
	}
	char[] buf = new char[n];
	df(0,'0',buf,ans);
	return ans;
	
	}

	private static void df(int i, char c, char[] buf, ArrayList<String> ans) {
		System.out.println(buf.length +" and " + i);
		if(i==buf.length)
		{
			ans.add(new String(buf));
			return ;
		}
	System.out.println("entering c = 0 " + i);
		buf[i] = '0';
		df(i+1,'0',buf,ans);
		
		
		System.out.println("entering c= 1 " + i);
		if(c!='1')
		{
			buf[i] = '1';
			df(i+1,'1',buf,ans);
		}
		
	}
}
