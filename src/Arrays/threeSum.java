package Arrays;

import java.util.*;

public class threeSum {

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> bruteOp = findTriplets(arr);
//		for (List<Integer> it : bruteOp) {
//            System.out.print("[");
//            for (Integer i : it) {
//                System.out.print(i + " ");
//            }
//            System.out.print("] ");
//        }
//		List<List<Integer>> betterOp = findTripletsUsingHashing(arr);
//		for (List<Integer> it : bruteOp) {
//			System.out.print("[");
//			for (Integer i : it) {
//				System.out.print(i + " ");
//			}
//			System.out.print("] ");
//		}
		
		List<List<Integer>> OptimalOp = findTripletsUsingOptimal(arr);
		for (List<Integer> it : bruteOp) {
			System.out.print("[");
			for (Integer i : it) {
				System.out.print(i + " ");
			}
			System.out.print("] ");
		}
	}

	private static List<List<Integer>> findTripletsUsingOptimal(int[] arr) {
		 List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Arrays.sort(arr);
		for(int i =0;i<arr.length-1;i++)
		{
			if(i!=0 && arr[i]==arr[i-1])
			{
				continue;
			}
			int j =i +1;
			int k = arr.length-1;
			
			while(j<k)
			{
				int sum = arr[i] + arr[j]+ arr[k];
				if(sum<0)
				{
					j++;
				}
				else if(sum>0)
				{
					k--;
				} else {
					List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
					ans.add(temp);
				j++;
				k--;
				while(j<k && arr[j]==arr[j-1])
				{
					j++;
				}
				while(j<k && arr[k]==arr[k+1])
				{
					k--;
				}
				}
			}
		}
		return ans;
	}
	

	private static List<List<Integer>> findTripletsUsingHashing(int[] arr) {
		Set<List<Integer>> st = new HashSet<List<Integer>>();

		for (int i = 0; i < arr.length; i++) {
			Set<Integer> hashIntegers = new HashSet<Integer>();
			for (int j = i + 1; j < arr.length; j++) {
				int third = -1 * (arr[i] + arr[j]);

				if (hashIntegers.contains(third)) {
					List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
					temp.sort(null);
					st.add(temp);
				}
				hashIntegers.add(arr[j]);
			}

		}
		List<List<Integer>> ans = new ArrayList<List<Integer>>(st);
		return ans;
	}

	private static List<List<Integer>> findTriplets(int[] arr) {
		Set<List<Integer>> bruteOp = new HashSet<List<Integer>>();
		// List<Integer> listop = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						List<Integer> listop = Arrays.asList(arr[i], arr[j], arr[k]);
						listop.sort(null);
						bruteOp.add(listop);
					}

				}
			}
		}
		List<List<Integer>> ans = new ArrayList<List<Integer>>(bruteOp);
		return ans;
	}

}
