package switchpoc;

import java.util.*;

public class StringSwitch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String fruit = sc.next();
		switch(fruit)
		{
		case "Apple":
			System.out.println("it is red");
			break;
		case "Bannana":
			System.out.println("It is Yellow");
			break;
		case "Guavva":
		 System.out.println("It is greem");
		break;
		default:
			System.out.println("Unknown");
		}
		sc.close();
	}

}
