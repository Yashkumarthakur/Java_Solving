package practice_codes.amazon;

import java.util.HashSet;

public class StringUniqueCombinations {
    public static void main(String[] args) {
        String inputString = "abc";
        callForGetCombination(inputString);
    }

    protected static int callForGetCombination(String inputString) {
        HashSet<String> result = new HashSet<>();
        System.out.println("Given String is : " + inputString);
        if (!validateInput(inputString))
            getCombinations(inputString, 0, inputString.length(), result);
        System.out.println("Total combinations are :" + result.size());
        return result.size();
    }

    private static void getCombinations(String inputString, int startPoint, int endPoint, HashSet<String> result) {
        if (startPoint == endPoint && !result.contains(inputString)) {
            System.out.println(inputString);
            result.add(inputString);
        }

        for (int i = startPoint; i < endPoint; i++) {
            inputString = swapPlace(inputString, startPoint, i);
            getCombinations(inputString, startPoint + 1, endPoint, result);
            inputString = swapPlace(inputString, startPoint, i);
        }

    }

    private static boolean validateInput(String inputString) {
        return inputString == null || inputString.isEmpty();
    }

    private static String swapPlace(String inputString, int startPoint, int endPoint) {
        char[] tempArray = inputString.toCharArray();
        char temp = tempArray[startPoint];
        tempArray[startPoint] = tempArray[endPoint];
        tempArray[endPoint] = temp;
        return String.valueOf(tempArray);
    }
}
