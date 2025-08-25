package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class UnionOftwoSortedArrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arr2 = { 2, 3, 4, 4, 5, 11, 12 };
		//ArrayList<Integer> restList = useMap(arr1, arr2);
		//System.out.println(restList);
		System.out.println("Optimal Approach");
		ArrayList<Integer> rest = twopointers(arr1, arr2);
		System.out.println(rest);
	}

	private static ArrayList<Integer> twopointers(int[] arr1, int[] arr2) {
	
		int n = arr1.length;
		int m = arr2.length;
		int i=0;
		int j=0;
		ArrayList<Integer> unionList = new ArrayList();
		while(i<n && j<m)
		{
			if(arr1[i]<= arr2[j])
			{
				if(unionList.size()==0 || unionList.get(unionList.size()-1)!=arr1[i])
				{
					unionList.add(arr1[i]);
				}
					i++;
				
			}
			else {
				
				if(unionList.size()==0 || unionList.get(unionList.size()-1)!=arr2[j])
				{
					unionList.add(arr2[j]);
				}
					j++;
				
				
			}
		}
		while(i<n)
		{
			if(unionList.get(unionList.size()-1)!=arr1[i])
			{
	unionList.add(arr1[i]);
			}
	i++;
		}
		while(j<m)
		{
			if(unionList.get(unionList.size()-1)!=arr2[j])
			{
	unionList.add(arr2[j]);
			}
	j++;

		}
		return unionList;
	}

	private static ArrayList<Integer> useMap(int[] arr1, int[] arr2) {

		HashMap<Integer, Integer> maps = new HashMap();
		ArrayList<Integer> mapstoList = new ArrayList();

		for (int i = 0; i < arr1.length; i++) {
			maps.put(arr1[i], maps.getOrDefault(arr1[i], 0) + 1);
		}
		for (int i = 0; i < arr2.length; i++) {
			maps.put(arr2[i], maps.getOrDefault(arr2[i], 0) + 1);
		}
		for (int itr : maps.keySet()) {
			mapstoList.add(itr);
		}
		return mapstoList;
	}

}
