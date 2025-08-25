package Arrays;

import java.util.ArrayList;

public class pascals {
	public static void main(String[] args) {
		int r = 7;
		int c = 4;
		int variant1 = findPascal(r,c);
		System.out.println(variant1);
		ArrayList<Integer> varient2 = findNthLineinPascal(r);
		System.out.println(varient2);
		printPascaltriangle(5);
		
	}

	private static void printPascaltriangle(int numberofRows) {

for(int i=0;i<numberofRows;i++)
{
	int val =1;
	
	for(int s =0;s<numberofRows-i;s++)
	{
		System.out.print(" ");
	}
	for(int k =0;k<=i;k++)
	{
		System.out.print(val + " ");
		val = val * (i-k)/(k+1);
	}
	System.out.println();
}
		
	}

	private static ArrayList<Integer> findNthLineinPascal(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int prev =1 ;
		int result =0;
		list.add(prev);
		for(int i =1;i<n;i++)
		{
			prev = prev * (n-i)/i;
			list.add(prev);
		}
		return list;
 	}

	private static int findPascal(int i, int j) {
		int element = findNCR(i-1,j-1);
		return element;
	}

	private static int findNCR(int i, int j) {
		int res =1 ;
		
		
		for(int itr =0;itr<j;itr++)
		{
			res = res * (itr-i);
			res = res/(itr+1);
		}
		return res * -1;
}
}