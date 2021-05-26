package practice_codes.hackerrank;

import java.util.HashSet;

import static java.lang.System.*;

/**
 * Patterns in string: 3 chars: a b c -> they will come in same sequence but frequency can change.
 * A pattern consists of one of more a's followed by one or more b's followed by one or more c's
 * Once the pattern complets then it should be followed by same pattern.
 * After that, another pattern can start but should be matched by same pattern.
 * Examples:
 * Valid:
 * abcabc
 * aabbccaabbccabcabc
 * abbcabbcaabccaabcc
 * Invalid:
 * abcaabc
 * abcabcaabcaabbc
 * abcbac
 * <p>
 * <p>
 * Time Complexity : O(n)
 * Space Complexity : O(log n)
 */

public class StringPatterCheck {
    public static void main(String[] args) {
        String inputString = "abcabc";
        callForCheckPatternCheck(inputString);
    }

    protected static boolean callForCheckPatternCheck(String inputString) {
        out.println("Input string is : " + inputString);
        boolean result = checkPatterCheck(inputString);
        out.println("Result is :" + result);
        return result;
    }

    private static boolean checkPatterCheck(String inputString) {
        if (validateInput(inputString))
            return false;
        HashSet<Character> charSet = new HashSet<>();
        String pattern = "";
        int stringLen = inputString.length();
        for (char i : inputString.toCharArray()) { // abccabcc
            if (i == 'a' && (!pattern.isEmpty() && pattern.charAt(pattern.length() - 1) == 'c')) {
                break;
            }
            if (!isValidChar(i, charSet))
                return false;
            charSet.add(i);
            pattern = pattern.concat(String.valueOf(i));
        }

        int patternLen = pattern.length();

        if (stringLen % patternLen != 0)
            return false;

        while (patternLen < stringLen) {
            if (!pattern.equalsIgnoreCase(inputString.substring(patternLen, patternLen + pattern.length())))
                return false;
            patternLen += pattern.length();
        }
        return true;
    }

    private static boolean isValidChar(char i, HashSet<Character> charSet) {
        return (i == 'a' && charSet.size() < 2) ||
                (i == 'b' && charSet.size() < 3) ||
                (i == 'c' && charSet.size() < 4);
    }

    private static boolean validateInput(String inputString) {
        return inputString == null || inputString.isEmpty();
    }
}
