package Strings;

import java.util.HashSet;

public class miniumDeletions {
	
	
	public static void main(String[] args) {
		String s = "aaabbbcc";
		System.out.println("Minimum deletion " + miniumDeletions(s));
	
	}

	private static int miniumDeletions(String s) {
		
		int[] freq = new int[26];
		for(char c : s.toCharArray())
		{
			freq[c-'a']++;
		}
		HashSet<Integer> hash = new HashSet<>();
		int deletioncount =0;
		for(int f : freq)
		{
			while(f>0 && !hash.add(f))
			{
				f--;
				deletioncount++;
			}
		}
		return deletioncount;
	}

}
