package BasicMath;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrintAllDivisors {
	
	public static void main(String[] args) {
		
	ArrayList<Integer> divisors = getAllDivisrorsForNumber(36);
		if(!divisors.isEmpty())
		{
			System.out.println(divisors);
		}
		ArrayList<Integer> divisors2 = getAllDivisrorsForNumber2(36);
		if(!divisors2.isEmpty())
		{
		 	Collections.sort(divisors2);
			System.out.println(divisors2);
		}
	}

	private static ArrayList<Integer> getAllDivisrorsForNumber2(int n) {
		
		ArrayList<Integer> divisorsList = new ArrayList();
		
		for(int i =1;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				divisorsList.add(i);
				if((n/i)!=i)
				{
					divisorsList.add(n/i);
				}
				
			}
		}
		return divisorsList;
		
	}

	private static ArrayList<Integer> getAllDivisrorsForNumber(int i) {
		
		ArrayList<Integer> divisorsList = new ArrayList();
		
		for(int n =1;n<=i;n++)
		{
			if(i%n==0)
			{
			divisorsList.add(n);	
			}
		}
		return divisorsList;
	}

}
