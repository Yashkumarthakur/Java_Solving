package practice_codes.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class FloodFillUsingRecursion {
    public static void main(String[] args) {
        int[][] inputArray = new int[][]{
                {1, 1, 2, 0, 1, 1, 1,},
                {1, 1, 2, 2, 2, 1, 0},
                {1, 2, 2, 2, 1, 1, 0},
                {1, 2, 2, 1, 1, 0, 0},
                {2, 2, 1, 1, 0, 0, 0},
                {0, 0, 1, 2, 2, 2, 0},
                {0, 0, 0, 2, 2, 0, 0}};
        int newNo = 4;
        int selectRow = 3;
        int selectColumn = 6;
        callForFloodFill(inputArray, newNo, selectRow, selectColumn);
    }

    protected static int callForFloodFill(int[][] inputArray, int newNo, int selectRow, int selectColumn) {
        out.println("Given Matrix is : " + Arrays.deepToString(inputArray).replace("],", "\n").replace("[[", "[\n["));
        out.println("Given new number : " + newNo);
        out.println("Selected Row is :" + selectRow + " & Column is : " + selectColumn);
        int previousNumber = -1;
        if (!validateInput(inputArray, selectRow, selectColumn)) {
            previousNumber = inputArray[selectRow][selectColumn];
        }
        List<Integer> result = new ArrayList<>();
        out.println("Current number on selected selectRow and selectColumn is : " + previousNumber);
        floodFillRecursion(inputArray, previousNumber, newNo, selectRow, selectColumn, result);
        out.println("Total count of replacement is : " + Arrays.deepToString(inputArray).replace("],", "]\n").replace("[[", "[\n["));
        out.println("Result is : " + result.size());
        return result.size();
    }

    private static void floodFillRecursion(int[][] inputArray, int previousNumber, int newNo, int row, int column, List<Integer> result) {
        if (previousNumber == -1)
            return;

        int rowLength = inputArray.length;
        if (row < 0 || row >= rowLength) return;

        int columnsLength = inputArray[row].length;
        if (column < 0 || column >= columnsLength) return;

        if (inputArray[row][column] != previousNumber) return;

        if (inputArray[row][column] == previousNumber) {
            inputArray[row][column] = newNo;
            result.add(1);
        }

        floodFillRecursion(inputArray, previousNumber, newNo, row - 1, column, result);
        floodFillRecursion(inputArray, previousNumber, newNo, row, column - 1, result);
        floodFillRecursion(inputArray, previousNumber, newNo, row + 1, column, result);
        floodFillRecursion(inputArray, previousNumber, newNo, row, column + 1, result);
    }

    private static boolean validateInput(int[][] inputArray, int row, int column) {
        return inputArray == null || (row > inputArray.length || column > inputArray[row].length);
    }
}
