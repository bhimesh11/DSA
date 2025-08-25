package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFreq {
	
	public static void main(String[] args) {
		
		SortCharactersByFreq sort = new SortCharactersByFreq();
		String input = "BhiMeSH";
		System.out.println(sort.solution(input));
	}

	private String solution(String input) {
		
		Map<Character,Integer> hash = new HashMap<>();
		for(char c : input.toCharArray())
		{
			hash.put(c,hash.getOrDefault(c, 0)+1);
		}
		
		PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
		pq.addAll(hash.entrySet());
		
		StringBuilder sb = new StringBuilder();
		while(!pq.isEmpty())
		{
			  Map.Entry<Character, Integer> entry = pq.poll();
			  char c = entry.getKey();
			  int value = entry.getValue();
			  for(int i =0;i<value;i++)
			  {
				  sb.append(c);
			  }
		}
		return sb.toString();
		
		
	}

}
