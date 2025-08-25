package BasicMath;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ReverseNumber {
	
	
	public static void main(String[] args) {
		int ReversedNUmber  = reverseNumber (123456789);
		System.out.println((ReversedNUmber));
	}

	private static int reverseNumber(int i) {
	
		int reverseNumber =0;
		while(i>0)
		{
			int lastDigit = i%10;
			i = i/10;
			reverseNumber = (reverseNumber * 10) + lastDigit;
		}
		return reverseNumber;
	}

}
