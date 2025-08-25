package Strings;

public class ReverseWordsIntheString {
	
	
	public static void main(String[] args) {
		String s = " welcome to the jungle";
		String output = reverseString(s);
		System.out.println(output);
	}

	private static String reverseString(String s) {
	
		String[] words = s.trim().split("\\s+");
		
		StringBuilder sb = new StringBuilder();
		for(int i = words.length-1;i>=0;i--)
		{
			sb.append(words[i]);
			if(i>0)
			{
				sb.append(" ");
			}
		}
		return sb.toString();
	}

}
