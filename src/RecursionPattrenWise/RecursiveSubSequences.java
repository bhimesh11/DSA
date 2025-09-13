package RecursionPattrenWise;

import java.util.ArrayList;

public class RecursiveSubSequences {

	public static void main(String[] args) {
		int n = 3;
		int[] arr = {3,1,2};
		ArrayList<Integer> al = new ArrayList<>();
		
printf(0,al,arr,n);
	}

	private static void printf(int i, ArrayList<Integer> al, int[] arr, int n) {
		if(i==n)
		{
			for(int k : al)
			{
				System.out.print(k + " ");
			}
			System.out.println();
			if(al.size()==0)
			{
				System.out.println();
			}
			return;
		}
		//take or pick the particular index into the subsequence
		al.add(arr[i]);
		printf(i+1, al, arr, n);
		al.remove(al.size()-1);
		//not pick or not take condition this element is not added to your sequence
		printf(i+1, al, arr, n);
		
	
		
		
		
	}
}
