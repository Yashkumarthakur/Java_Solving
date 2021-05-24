package practice_codes.paypal;

import static java.lang.System.out;

/**
 * Given two binary strings, return their sum (also a binary string).
 * Example: 
 * Input:  a = "11", b = "1"
 * Output: "100" 
 *
 */
public class BinaryNumberAddition {

	public static void main(String args[]) {
		String binary1 = "11010";
		String binary2 = "00101001";
		callAddBinary(binary1, binary2);
	}

	protected static String callAddBinary(String binary1, String binary2) {
		out.println("Given two binary strings are:");
		out.println(binary1);
		out.println(binary2);
		String result = addBinary(binary1, binary2);
		out.println("Addition of binary is :" + result);
		return result;
	}

	// This function adds two
	// binary strings and return
	// result as a third string
	static String addBinary(String binary1, String binary2) {

		// Initialize result
		String result = "";

		// Initialize digit sum
		int s = 0;

		int i = binary1.length() - 1, j = binary2.length() - 1;
		while (i >= 0 || j >= 0 || s == 1) {

			s += ((i >= 0) ? binary1.charAt(i) - '0' : 0);
			s += ((j >= 0) ? binary2.charAt(j) - '0' : 0);

			result = (char) (s % 2 + '0') + result;

			s /= 2;

			i--;
			j--;
		}

		// remove all initial zeros
		return result.replaceAll("^0+(?!$)", "");
	}

}
