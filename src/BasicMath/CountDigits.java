package BasicMath;

import java.util.ArrayList;

public class CountDigits {
	
	public static void main(String[] args) {
		
		int count = countDigits(123);
		System.out.println(count);
		
		
	}

	private static int countDigits(int i) {
		
		ArrayList<Integer> counterList = new ArrayList<>();
		int counter = 0;
		while(i>0)
		{
			
			int lastdigit = i%10;
			counter = counter + 1;
			i =i/10;
			counterList.add(i);
		}
		System.out.println(counterList);
		return counter;
		
		
	}

}
