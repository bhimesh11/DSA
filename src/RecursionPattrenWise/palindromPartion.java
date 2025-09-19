package RecursionPattrenWise;

import java.util.*;
public class palindromPartion {
	
	public static void main(String[] args) {
		String st = "aabb";
		List<List<String>>  ls = partitionPalindromes(st);
		System.out.println(ls);
	}

	private static List<List<String>> partitionPalindromes(String st) {
		List<List<String>> res = new ArrayList<>();
		List<String> path = new ArrayList<>();
		helper(st,0,res,path);
		return res;
	}

	private static void helper(String st, int index, List<List<String>> res, List<String> path) {
	
		if(index == st.length())
		{
			res.add(new ArrayList<>(path));
		}
		for(int j=index;j<st.length();j++)
		{
			
			if(isPalindrome(st,index,j))
			{
				path.add(st.substring(index, j+1));
				helper(st, index+1, res, path);
				path.remove(path.size()-1);
			}
		}
		
	}

	private static boolean isPalindrome(String st, int start, int end) {
		while(start<=end)
		{
			if(st.charAt(start++)!= st.charAt(end--))
			{
				return false;
			}
		}
		return true;
	}

}
