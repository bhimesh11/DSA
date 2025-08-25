package pattrens;

public class pattren_1 {

	public static void main(String[] args) {
		printthepattrens(4);
		System.out.println("-----------------------");
		printthepattrens2(5);
		System.out.println("-----------------------");
		printthepattrens3(5);
		System.out.println("-----------------------");
		printthepattrenss5(5);
		System.out.println("-----------------------");
		printthepattrens5(5);
		System.out.println("-----------------------");
		printthepattrens6(5);
		System.out.println("-----------------------");
		printthepattrens7(5);
		System.out.println("-----------------------");
		printthepattrens8(5);
		System.out.println("-----------------------");
		printthepattrenss9(10);
		System.out.println("-----------------------");
		printthepattrens10(5);
		System.out.println("-----------------------");
		printthepattrens11(5);
		System.out.println("-----------------------");
		printthepattrens12(5);
		System.out.println("-----------------------");
		printthepattrens13(5);
		System.out.println("-------------------");
		printthepattrens14(5);
		System.out.println("-------------------");
		printthepattrens15(5);
		System.out.println("-------------------");
		printthepattrens16(5);
		System.out.println("-------------------");
		printthepattrens17(5);
		System.out.println("-------------------");
		printthepattrens18(5);
		System.out.println("-------------------");
		printthepattrens18(5);
		System.out.println("-------------------");
		printthepattrens19(5);
		System.out.println("-------------------");
		printthepattrens20(5);
		System.out.println("-------------------");
		printthepattrens21(5);
		
	 }

	private static void printthepattrens21(int n) {
		
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				if(i==0||j==0||i==n-1||j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

	private static void printthepattrens20(int n) {
		int spaces = 2 * n - 2;

	    for (int i = 1; i <= 2 * n - 1; i++) {
	        int stars = i;
	        if (i > n) {
	            stars = 2 * n - i;
	        }

	        // Print stars
	        for (int j = 1; j <= stars; j++) {
	            System.out.print("*");
	        }

	        // Print spaces
	        for (int j = 1; j <= spaces; j++) {
	            System.out.print(" ");
	        }

	        // Print stars again
	        for (int j = 1; j <= stars; j++) {
	            System.out.print("*");
	        }

	        // Move to next line
	        System.out.println();

	        // Adjust spaces for next row
	        if (i < n) {
	            spaces -= 2;
	        } else {
	            spaces += 2;
	        }
	    }
	}
	
	private static void printthepattrens19(int n) {
		int initialSpaces =0;
		for(int i =0;i<n;i++)
		{
			for(int j =1 ;j<=n-i;j++)
			{
				System.out.print("*");
			}
			for(int j =0;j<initialSpaces;j++)
			{
				System.out.print(" ");
			}
			for(int j =1 ;j<=n-i;j++)
			{
				System.out.print("*");
			}
			initialSpaces = initialSpaces +2;
			System.out.println("");
			
		}
		initialSpaces =8;
		for(int i =1;i<=n;i++)
		{
			for(int j =1 ;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j =0;j<initialSpaces;j++)
			{
				System.out.print(" ");
			}
			for(int j =1 ;j<=i;j++)
			{
				System.out.print("*");
			}
			initialSpaces = initialSpaces - 2;
			System.out.println("");
			
		}
		
	}
	

	private static void printthepattrens18(int n) {
		
		for(int i=0;i<n;i++) {
			
			for(char ch = (char) ('E'-i);ch<='E';ch++)
			{
				System.out.print(ch);
			}
			System.out.println("");
			
		}
	}

	private static void printthepattrens17(int n) {
		
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			char ch = 'A';
			int breakpoint = (2*i+1)/2;
			for(int j=0;j<2 * i +1;j++)
			{
				 System.out.print(ch);
				if(j<=breakpoint )
				{
					ch++;
					
				}
				else {
					ch--;
				}
				
			}
			for(int j =0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			System.out.println("");
		}
		
	}

	private static void printthepattrens16(int n) {
		char ch = 'A';
		for(int i =0;i<n;i++)
		{
			
			
			for(int j =0;j<=i;j++)
			{
				System.out.print(ch);
			}
			System.out.println("");
			++ch;
		}
		
	}

	private static void printthepattrens15(int n) {
		for(int i = n;i>=1 ;i--)
		{
			//System.out.println(i);
			char ch = 'A';
			for(int j =1;j<=i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println("");
			//break;
		}
		
	}

	private static void printthepattrens14(int n) {
		
		for(int i =0;i<n;i++)
		{
			char ch = 'A';
			for(int j =0;j<=i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println("");
		}
	}

	private static void printthepattrens13(int n) {
		int star = 1;
		
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(i==0)
				{
					System.out.print(star);
					break;
				}
				else
				{
					System.out.print(++star);
				}
			}
			for(int j =0;j<n-1;j++)
			{
				System.out.print(" ");
			}
			System.out.println("");
		}
		// TODO Auto-generated method stub
		
	}

	private static void printthepattrens12(int n) {
		 int space = 2 *(n-1);
		 
	for(int i =1;i<=n;i++)
	{
		 
		for(int j =1;j<=i;j++)
		{
			System.out.print(j);
		}
		
		
		 
			for(int s = 1;s<=space;s++ )
			{
				System.out.print(" ");
			}
			
		
		for(int j=i;j>=1;j--)
		{
			System.out.print(j);
		}
		System.out.println("");
		space = space-2;
	}
		
	}

	private static void printthepattrens11(int n) {
		int stars=0;
		for(int i =0;i<n;i++)
		{
			if(i%2 ==0)
			{
				stars =1;
			}
			else
			{
				stars=0;
			}
			for(int j =0;j<=i;j++)
			{
				System.out.print(stars);
			stars = 1-stars;
			}
			System.out.println("");
		}
		
	}

	private static void printthepattrens10(int n) {
		int stars = 0;
		for (int i = 0; i < 2 * n - 1; i++) {
			if (i > n) {
				stars = 2 * n - i;

			} else {
				stars = i;
			}
			for (int j = 1; j <= stars; j++)

			{
				System.out.println("*");
			}

		}
	}

	private static void printthepattrenss9(int n) {
		
		if(n%2==0)
		{
			printthepattrens7(n/2);
		}
		
			printthepattrens8(n/2);
			}

	private static void printthepattrens8(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*n - (2 * i + 1); j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("");
		}

		
	}

	private static void printthepattrens7(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

	private static void printthepattrens6(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");

		}

	}

	private static void printthepattrens5(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}

	}

	private static void printthepattrenss5(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}

	}

	private static void printthepattrens3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}

	}

	private static void printthepattrens2(int n) {

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	private static void printthepattrens(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
