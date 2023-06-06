package practice_codes.amazon_interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllSubsetsOfArray {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(8, 13, 3, 22, 17, 39, 87, 45));
        callForFindAllSubsetsOfArray(input);
    }

    protected static List<List<Integer>> callForFindAllSubsetsOfArray(List<Integer> input) {
        System.out.println("Given input array : " + input);
        List<List<Integer>> result = findAllSubsetsOfArray(input);
        System.out.println("Result is : ");
        int i = 1;
        for (List<Integer> l : result) {
            System.out.println(i + " " + l);
            i++;
        }

        return result;
    }

    /*private static int findAllSubsetsOfArray(List<Integer> input) {
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < input.size(); i++) {
            for (int j = i; j < input.size(); j++) {
//                result.add()
            }
        }
        return 0;
    }*/

    public static List<List<Integer>> findAllSubsetsOfArray(List<Integer> inputList) {
        List<List<Integer>> resultList = new ArrayList<>();
        subsetsHelper(resultList, new ArrayList<>(), inputList, 0);
        return resultList;
    }

    private static void subsetsHelper(List<List<Integer>> resultList, List<Integer> tempList, List<Integer> inputList, int start) {
        resultList.add(new ArrayList<>(tempList));
        for (int i = start; i < inputList.size(); i++) {
            // add element
            tempList.add(inputList.get(i));
            // Explore
            subsetsHelper(resultList, tempList, inputList, i + 1);
            // remove
            tempList.clear();
        }
    }


}
