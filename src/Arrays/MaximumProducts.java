package Arrays;

public class MaximumProducts {
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,0};
		int ans = Integer.MIN_VALUE;
		int prefix =1 ;
		int suffix =1;
		if(prefix==0)prefix=1;
		if(suffix==0) suffix=1;
		for(int i =0;i<arr.length;i++)
		{
			prefix = prefix*arr[i];
			suffix = suffix * arr[i];
			ans = Math.max(ans, Math.max(prefix, suffix));
		}
		System.out.println(ans);
		
				
	}

}
