package BasicMath;

public class CheckPalindrome {

	public static void main(String[] args) {

		Boolean check = CheckPalindrome(121);
		if (check) {
			System.out.println(check);
		} else {
			System.out.println(check);
		}
	}

	private static Boolean CheckPalindrome(int i) {

		int storeOrginal = i;

		int reverseNumber = 0;

		while (i > 0) {
			int lastDigit = i % 10;
			i = i / 10;
			reverseNumber = (reverseNumber * 10) + lastDigit;
		}
		if (reverseNumber == storeOrginal) {
			return true;
		} else {
			return false;
		}
	}

}
