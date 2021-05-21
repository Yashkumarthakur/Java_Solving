package practice_codes.hackerrank;

import static java.lang.System.out;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * You'll be given a sentence. You should count the number words in the sentence. 
 * Words should be counted using any kind of white spaces such as space, tab, newline along with comma, semicolon and fullstops.
 * 
 * Input : East or west,    CSE is the best.
 * Output : 7
 * 
 * Input : I love my country
 * Output : 4
 *
 */
public class CountWords {

	public static void main(String args[]) {
		String str = " Beauty lies in the eyes of beholder, 1a abc-abc av[i v.";
		callCountWords(str);
	}

	protected static int callCountWords(String str) {
		out.println("Given String to calculate words:");
        out.println(str);
        int result = countWords(str);
        out.println("Number of words count :" + result);
        return result;
		
	}

	// Function to count total number
	// of words in the string
	private static int countWords(String str) {

		// Check if the string is null
		// or empty then return zero
		if (!validateString(str))
			return 0;

		// trim string to remove start and ending spaces
		str = str.trim();

		// Splitting the string around
		// matches of the given regular
		// expression
		String[] words = str.split("\\s+");

		int totalWords = words.length;

		Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~[0-9]]");
		for (String word : words) {
			Matcher hasSpecial = special.matcher(word);
			if (hasSpecial.find()) {
				totalWords--;
			}
		}

		// Return number of words
		// in the given string
		return totalWords;
	}

	private static boolean validateString(String str) {
		return !(str == null || str.isEmpty());	
	}
}
