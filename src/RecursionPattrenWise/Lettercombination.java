package RecursionPattrenWise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Lettercombination {
	
	
	public static void main(String[] args) {
		String numbers = "24";
		List<String> ans = findNumbers(numbers);
		System.out.println(ans);

	}

	private static List<String> findNumbers(String numbers) {
		
		  HashMap<Character,String> m = new HashMap<>();
	        m.put('2',"abc");
	        m.put('3',"def");
	        m.put('4',"ghi");
	        m.put('5',"jkl");
	        m.put('6',"mno");
	        m.put('7',"pqrs");
	        m.put('8',"tuv");
	        m.put('9',"wxyz");
	  
		List<String> ans = new ArrayList<>();
	      
			if(numbers.length()==0)
			{
				return null;
			}
			
		String temp = "";
		helper(0,numbers,temp,ans,m);
		return ans;
	}

	private static void helper(int i, String numbers, String temp, List<String> ans, HashMap<Character, String> m) {
		
		if(i==numbers.length())
		{
			ans.add(temp);
			return;
		}
		char ch = numbers.charAt(i);
		String str = m.get(ch);
		for(int j =0;j<str.length();j++)
		{
			char c = str.charAt(j);
			helper(i+1, numbers, temp+c, ans, m);
		}
		
	}

}
