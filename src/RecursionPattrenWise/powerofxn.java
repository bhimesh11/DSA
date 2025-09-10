package RecursionPattrenWise;import LinkedList.doubleLinkedList.doubleLinkedListBasicProblems;

public class powerofxn {
	
	public static void main(String[] args) {
		
		System.out.println(myPow(2,10));
	}

	private static int myPow(int i, int j) {

		 int ans = 1;
		long n = j;
		if(n<0)
		{
			n = -1*n;
		}
		while(n>0)
		{
			if(n%2==1)
			{
				ans = ans*i;
				n = n-1;
			}else {
				i = i *i;
				n = n/2;
			}
		}
		if(n<0)
		{
			ans = (int) ((double)(1.0) / (double)(ans));
		}
		return ans;
	}

}
