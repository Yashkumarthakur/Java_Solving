package practice_codes.hackerrank;

// Java program to find all substring that  
// contain all vowels 

import java.util.HashSet;

import static java.lang.System.*;

/**
 * We have been given a string in lowercase alphabets. We need to print substrings that contain all the vowels at-least one time and there are no consonants (non-vowel characters) present in the substrings.
 * <p>
 * Examples:
 * <p>
 * Input : str = aeoibddaeoiud
 * Output : 1 -> (aeoiu)
 * <p>
 * Input : str = aeoibsddaeiouudb
 * Output : 2 -> (aeiou, aeiouu)
 */

public class VowelSubstring {
    public static void main(String[] args) {
        String str = "axyzaeiou";
        out.println("SubString count is : " + getResult(str));
    }

    private static int getResult(String str) {
        out.println("Given String is :" + str);
        return findSubstring(str);
    }

    public static int findSubstring(String str) {
        HashSet<Character> hash = new HashSet<>();
        int subStringCount = 0;
        int stringLength = str.length();

        for (int i = 0; i < stringLength; i++) {
            for (int j = i; j < stringLength; j++) {
                char temp = str.charAt(j);
                if (!isVowel(temp))
                    break;

                hash.add(temp);

                if (hash.size() == 5)
                    subStringCount++;
            }
            hash.clear();
        }
        return subStringCount;
    }

    static boolean isVowel(char x) {
        return (x == 'a' || x == 'e' || x == 'i'
                || x == 'o' || x == 'u');
    }
}