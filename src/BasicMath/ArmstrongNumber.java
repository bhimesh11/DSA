package BasicMath;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Boolean isArmStrong = checkArmStrongNumber(371);
		if(isArmStrong)
		{
			System.out.println(isArmStrong);
		}else {
			System.out.println(isArmStrong);
		}
	}

	private static Boolean checkArmStrongNumber(int i) {
		int orginalNumber = i;
		int sum = 0;
		while (i > 0) {
			int lastdigit = i % 10;
			sum = sum + (lastdigit * lastdigit * lastdigit);
			i = i / 10;

		}
		if (sum == orginalNumber) {
			return true;
		} else

		{
			return false;
		}
	}

}
