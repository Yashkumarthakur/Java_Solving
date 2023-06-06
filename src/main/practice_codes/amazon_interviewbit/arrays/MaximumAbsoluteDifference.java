package practice_codes.amazon_interviewbit.arrays;

public class MaximumAbsoluteDifference {
    // Java program to calculate the maximum
// absolute difference of an array.
    // Function to return maximum absolue
    // difference in linear time.
    private static int maxDistance(int[] array) {
        // max and min variables as described
        // in algorithm.
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {

            // Updating max and min variables
            // as described in algorithm.
            max1 = Math.max(max1, array[i] + i);
            min1 = Math.min(min1, array[i] + i);
            max2 = Math.max(max2, array[i] - i);
            min2 = Math.min(min2, array[i] - i);
        }

        // Calculating maximum absolute difference.
        return Math.max(max1 - min1, max2 - min2);
    }

    // Driver program to test above function
    public static void main(String[] args) {
        int[] array = {-70, -64, -6, -56, 64,
                61, -57, 16, 48, -98};
        System.out.println(maxDistance(array));
    }
}
