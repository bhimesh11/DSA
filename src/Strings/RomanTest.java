package Strings;

import java.util.HashMap;

public class RomanTest {
	
	public static void main(String[] args) {
		
		RomanTest rt = new RomanTest();
		System.out.println(rt.romantoIntehger("MCMXCIV"));
		//System.out.println(rt.IntegertoRoman(""));
	}

	private int romantoIntehger(String string) {
		
		HashMap<Character,Integer> romanMap = new HashMap<>();
		 romanMap.put('I', 1);
	        romanMap.put('V', 5);
	        romanMap.put('X', 10);
	        romanMap.put('L', 50);
	        romanMap.put('C', 100);
	        romanMap.put('D', 500);
	        romanMap.put('M', 1000);
	        
	        int total =0;
	        int prev =0;
	        
	        for(int i = string.length()-1;i>=0;i--)
	        {
	        	int value = romanMap.get(string.charAt(i));
	        	
	        	if(value<prev)
	        	{
	        		total -= value;
	        		
	        	}else {
	        		total+=value;
	        	}
	        	prev=value;
	        }
	        return total;
		
	}

}
