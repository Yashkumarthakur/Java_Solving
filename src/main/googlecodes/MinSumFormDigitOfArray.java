package googlecodes;

import java.util.Arrays;

public class MinSumFormDigitOfArray {
    public static void main(String[] args) {
        int[] array = new int[]{6, 8, 4, 5, 2, 3};
        System.out.println("Minimum Sum : " + diaplay(array));
    }

    public static int diaplay(int[] array) {
        System.out.println("Given Array : " + Arrays.toString(array));
        return findMinSum(array);
    }

    private static int findMinSum(int[] array) {
        if (validateArray(array))
            return 0;

        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        StringBuilder num = new StringBuilder("");
        StringBuilder num2 = new StringBuilder("");

        for (int i = 1; i <= sortedArray.length; i++) {
            if (i % 2 == 0) {
                num.append(sortedArray[i - 1]);
            } else
                num2.append(sortedArray[i - 1]);
        }

        return Integer.parseInt(num.toString()) + Integer.parseInt(num2.toString());
    }

    private static boolean validateArray(int[] array) {
        return array.length <= 1;
    }
}
