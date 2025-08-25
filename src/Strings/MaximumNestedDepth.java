package Strings;

public class MaximumNestedDepth {
	
	public static void main(String[] args) {
		String input = "(1+(2+3)+((8)/4))+1";
		MaximumNestedDepth maxdepth = new MaximumNestedDepth();
		int value = maxdepth.findSolution(input);
		System.out.println(value);
	}

	private int findSolution(String input) {
		int res =0,cur =0;
		for(char c: input.toCharArray())
		{
			if(c=='(')
			{
				cur++;
				res = Math.max(res, cur);
			}
			if(c==')')
			{
				cur--;
			}
		}
		return res;
	}

}
