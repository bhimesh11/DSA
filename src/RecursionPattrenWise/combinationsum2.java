package RecursionPattrenWise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class combinationsum2 {

	public static void main(String[] args) {
		int arr[] = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 7;
		List<List<Integer>> ls = combinationSum2(arr, target);
		System.out.println("Combinations are: ");
		for (int i = 0; i < ls.size(); i++) {
			for (int j = 0; j < ls.get(i).size(); j++) {
				System.out.print(ls.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

	private static List<List<Integer>> combinationSum2(int[] arr, int target) {
		Set<List<Integer>> result = new HashSet<>();
		Backtracking(arr, 0, target, new ArrayList<>(), result);
		return new ArrayList<>(result);
	}

	private static void Backtracking(int[] arr, int start, int target, ArrayList arrayList, Set<List<Integer>> result) {
		if (target < 0) {
			return;
		}
		if (target == 0) {
			result.add(new ArrayList<>(arrayList));
		}
		for (int i = start; i < arr.length; i++) {
			arrayList.add(arr[i]);
			Backtracking(arr, start + 1, target - arr[i], arrayList, result);
			arrayList.remove(arrayList.size() - 1);

		}
	}

}
