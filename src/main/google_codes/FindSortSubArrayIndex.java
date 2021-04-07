package google_codes;

import java.util.Arrays;

public class FindSortSubArrayIndex {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 5, 4, 8, 9};
        System.out.println("Sub Array index" + Arrays.toString(display(array)));
    }

    public static int[] display(int[] array) {
        System.out.println("Given Array :" + Arrays.toString(array));
        return findSubArray(array);
    }

    private static int[] findSubArray(int[] array) {
        if (validateArray(array))
            return new int[]{0};

        int[] result = new int[2];
        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            if (i + 1 != array.length) {
                if (!flag && array[i] > array[i + 1]) {
                    result[0] = i;
                    flag = true;
                }
                if (flag && array[i] < array[i + 1]){
                        result[1] = i;
                        return result;
                }
            }
            if (flag)
                result[1] = i;
        }
        return result;
    }

    private static boolean validateArray(int[] array) {
        return array.length < 2;
    }
}
