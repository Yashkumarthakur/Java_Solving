package practice_codes.hackerrank;

// Java program to find all substring that  
// contain all vowels 
import java.util.HashSet;
  
/**
 * We have been given a string in lowercase alphabets. We need to print substrings that contain all the vowels at-least one time and there are no consonants (non-vowel characters) present in the substrings.

Examples:

Input : str = aeoibddaeoiud
Output : 1 -> (aeoiu)

Input : str = aeoibsddaeiouudb
Output : 2 -> (aeiou, aeiouu)
 *
 */
public class VowelSubstring {
  
    // Returns true if x is vowel.
    static boolean isVowel(char x) {
        // Function to check whether a character is
        // vowel or not
        return (x == 'a' || x == 'e' || x == 'i' 
                || x == 'o' || x == 'u');
    }
  
    public static int findSubstring(String str) {
        HashSet<Character> hash = new HashSet<Character>(); 
        int count = 0;
            // To store vowels
  
        // Outer loop picks starting character and
        // inner loop picks ending character.
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
  
                // If current character is not vowel,
                // then no more result substrings
                // possible starting from str[i].
                if (isVowel(str.charAt(j)) == false)
                    break;
  
                // If vowel, then we insert it in hash
                hash.add(str.charAt(j));
  
                // If all vowels are present in current
                // substring
                if (hash.size() == 5)
                    count++;
            }
            hash.clear();
        }
        return count;
    }
  
    // Driver code
    public static void main(String[] args) {
        String str = "axyzaeiou";
        System.out.println("Vowel Substring count is : " + findSubstring(str));
    }
}