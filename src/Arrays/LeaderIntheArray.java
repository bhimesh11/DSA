package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LeaderIntheArray {
	
	public static void main(String[] args) {
		int[] arr = {4,7,1,0};
		ArrayList<Integer> lis = findLeader(arr);
		System.out.println(lis );
		
	}

	private static ArrayList<Integer> findLeader(int[] arr) {
		
		ArrayList<Integer> result = new ArrayList<>();
		int maxFromright = arr[arr.length-1];
		result.add(maxFromright);
		for(int i = arr.length-2;i>=0;i--)
		{
			if(arr[i]>maxFromright)
			{
				maxFromright = arr[i];
				result.add(arr[i]);
			}
		}
		Collections.reverse(result);
		return result;
	}

}
