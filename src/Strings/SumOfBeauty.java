package Strings;

public class SumOfBeauty {
	
	public static void main(String[] args) {
		String s = "aabcb";
		int beauty = findBeauty(s);
		System.out.println(beauty);
	}

	private static int findBeauty(String s) {
		int n = s.length();
		int result =0;
		for(int i =0;i<n;i++)
		{
			int[] freq = new int[26];
			
			for(int j=i;j<n;j++)
			{
				freq[s.charAt(j)-'a']++;
				
				int freqMin = Integer.MAX_VALUE;
				int freqMax =0;
				
				for(int k =0;k<26;k++)
				{
					if(freq[k]>0)
					{
						freqMin = Math.min(freqMin, freq[k]);
						freqMax = Math.max(freqMax, freq[k]);
					}
					
				}
				int beauty = freqMax-freqMin;
				result = result+beauty;
				
			}
		}
		return result;
	}

}
