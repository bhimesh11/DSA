package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashing_2 {
	
	public static void main(String[] args) {
	
		String s = "abcdabehf";
		char[] sa = s.toCharArray();
		HashMap<Character,Integer> mp = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<=sa.length-1;i++)
		{
			if(mp.containsKey(sa[i])) {
				mp.put(sa[i], mp.get(sa[i])+1);
			}
			else {
				mp.put(sa[i], 1);
			}
		}
		for(Map.Entry<Character, Integer>itr: mp.entrySet())
		{
		System.out.println(itr.getKey() + " appear " + itr.getValue());;	
		}
		int q;
		q = sc.nextInt();
		while(q!=0)
		{
			char alphabet ;
			alphabet = sc.next().charAt(0);
			if(mp.containsKey(alphabet))
			{
				System.out.println(mp.get(alphabet));
			}
			else
			{
				System.out.println(0);
			}
		}
			
	}

}
