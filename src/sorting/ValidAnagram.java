package sorting;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	
	public static void main(String[] args) {
		
		String s = "rat";
		String t = "tar";
		//boolean b = checkAnagramsinbothString(s,t);
		boolean a = checkAnagramsinbothStringusingHashMap(s, t);
		System.out.println(a);
	}

	private static boolean checkAnagramsinbothStringusingHashMap(String s, String t) {
		if(s.length()!=t.length())
		{
			return false;
		}
		HashMap<Character, Integer> map = new HashMap();
		for(char ch: s.toCharArray())
		{
			
			map.put(ch, map.getOrDefault(ch,0)+1);
			System.out.println("In String s:");
			for(Map.Entry<Character, Integer> entries : map.entrySet())
			{
				System.out.println("Key : " + entries.getKey() + " value " + entries.getValue());
			}
		}
		for(char ch : t.toCharArray())
		{
			if(!map.containsKey(ch))
			{
				return false;
			}
			
			map.put(ch, map.get(ch)-1);
			System.out.println("In String t:");
			for(Map.Entry<Character, Integer> entries : map.entrySet())
			{
				System.out.println("Key : " + entries.getKey() + " value " + entries.getValue());
			}
			
			System.out.println("-------------------------------------------------------------------");
			for(Map.Entry<Character, Integer> entries : map.entrySet())
			{
				System.out.println("Key : " + entries.getKey() + " value " + entries.getValue());
			}
			if(map.get(ch)<0)
			{
				return false;
			}
		}
		return true;
	}
	

	private static boolean checkAnagramsinbothString(String s, String t) {
	
		if(s.length()!=t.length())
		{
			return false;
		}
		int [] alpharray = new int[26];
		printarray(alpharray);
		for(int i =0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
			alpharray[s.charAt(i)-'a']++;
			printarray(alpharray);
			System.out.println(t.charAt(i));
			alpharray[t.charAt(i)-'a']--;
			printarray(alpharray);
		}
		System.out.println("final Array ");
		 printarray(alpharray);
		for(int count:alpharray)
		{
			
			if(count!=0)
			{
				return false;
			}
		
		}
		return true;
	}

	
	private static void printarray(int[] arr) {
		for(int num:arr)
		{
			System.out.print(num + " ");
		}
		System.out.println();
		
	}
}
