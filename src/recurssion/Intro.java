package recurssion;

public class Intro {
	
	public static void main(String[] args) {
	printFunction(2);
	}

	private static void printFunction(int i) {
		System.out.println(i);
		printFunction(i);
		
	}

}
