package practice_codes.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;


/**
 * Given a list of words and prefix and suffix Find the last word which can be formed by prefix and suffix.
 * <p>
 * input = ["jar", "plane", "perform", "scattered", "believe", "old-fashioned", "fragile", "accept", "arithmetic", "foregoing", "ship", "icky", "capable", "rabid", "blow", "pink", "needless", "industrious", "many", "honorable", "play", "puzzling", "warm", "fruit", "cross", "recognise", "enjoy", "boy", "reflective", "advise", "inexpensive", "hop", "telephone", "mixed", "tour", "rich", "tap"]
 * prefix = "per"
 * suffix = "rm"
 * <p>
 * <p>
 * output = "perform"
 * <p>
 * Space Complexity : O(1)
 * Time Complexity : O(n)
 */

public class WordSearchByPrefixSuffix {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>(Arrays.asList("jar", "plane", "perform", "scattered", "believe", "old-fashioned", "fragile", "accept", "arithmetic", "foregoing", "ship", "icky", "capable", "rabid", "blow", "pink", "needless", "industrious", "many", "honorable", "play", "puzzling", "warm", "fruit", "cross", "recognise", "enjoy", "boy", "reflective", "advise", "inexpensive", "hop", "telephone", "mixed", "tour", "rich", "tap", "excited", "dashing", "acoustics", "motionless", "bear", "unite", "glossy", "complex", "creepy", "chess", "time", "terrible", "smelly"));
        String prefix = "pe";
        String suffix = "rm";
        out.println("Found word with prefix : 'pe' & suffix : 'rm' is : " + getResult(prefix, suffix, wordList));
    }

    protected static String getResult(String prefix, String suffix, List<String> wordList) {
        out.println("Given wordList : " + wordList);
        return findWord(prefix, suffix, wordList);
    }

    private static String findWord(String prefix, String suffix, List<String> wordList) {
        String result = "";
        if (validateInputes(prefix, suffix, wordList))
            return result;

        for (String word : wordList) {
            if (isWordMatch(word, prefix, suffix) && word.length() >= result.length()) {
                result = word;
            }
        }

        return result;
    }

    private static boolean isWordMatch(String word, String prefix, String suffix) {
        boolean isMatch = false;
        if (prefix.length() != 0 && word.length() >= prefix.length())
            isMatch = prefix.equalsIgnoreCase(word.substring(0, prefix.length()));
        if (suffix.length() != 0 && word.length() >= suffix.length()) {
            isMatch = suffix.equalsIgnoreCase(word.substring(word.length() - suffix.length()));
        }
        return isMatch;
    }

    private static boolean validateInputes(String prefix, String suffix, List<String> wordList) {
        return wordList.isEmpty() && (prefix.isEmpty() || suffix.isEmpty());
    }
}
