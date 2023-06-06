package practice_codes.hackerrank;

import java.util.*;

public class GetTopKOccurrence {
    public static void main(String[] args) {
        String input = "1 1 2 2 3 3 6 6 1 2 5 4 1 4 7 8 8 8 9 9 9 4 4 1 2 1 2 1 2 1 5 6 9 8 8 8 8 8 5 1 4 6 3 2 7 8 4 5 6 2 7";
        int k = 0;
        callForGetTopKOccurrence(input, k);
    }

    protected static int[] callForGetTopKOccurrence(String input, int k) {
        int[] result;
        if (input == null || input.isEmpty()) return new int[0];
        List<String> inputList = new ArrayList<>(Arrays.asList(input.split(" ")));
        System.out.println("Given input is : " + inputList);
        System.out.println("The Kth input is :" + k);

        result = findTopKOccurrence(inputList, k);
        System.out.println("Result is : " + Arrays.toString(result));
        return result;
    }

    private static int[] findTopKOccurrence(List<String> inputList, int k) {
        HashMap<String, Integer> hp = new HashMap<>();
        for (String s : inputList) {
            hp.put(s, hp.getOrDefault(s, 0) + 1);
        }
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(hp.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int[] result = new int[Math.min(k, hp.size())];
        for (int i = 0; i < Math.min(k, hp.size()); i++) {
            result[i] = Integer.parseInt((sortedList.get(i)).getKey());
        }
        return result;
    }
}
