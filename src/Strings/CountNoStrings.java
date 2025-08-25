package Strings;

import java.util.HashSet;
import java.util.Set;

public class CountNoStrings {

	public static void main(String[] args) {
		String s = "ababa";
		int count = findSubString(s);
		System.out.println(count);
	}

	private static int findSubString(String s) {
		
		int n =s.length();
		Set<String> hashset = new HashSet<>(n * (n+1)/2);
		for(int i =0;i<n;i++)
		{
			for(int j =i+1;j<=n;j++)
			{
				hashset.add(s.substring(i,j));
			}
		}
		return hashset.size();
	}
}
