package googlecodes;

import java.util.ArrayList;

public class JumpingNoInRange {
    public static void main(String[] args) {
        int jumpingNoTill = 105;
        System.out.println("All Jumping from given No. : " + display(jumpingNoTill));
    }

    public static ArrayList<Integer> display(int jumpingNoTill) {
        System.out.println("Given No : " + jumpingNoTill);
        return jumpingNo(jumpingNoTill);
    }

    private static ArrayList<Integer> jumpingNo(int jumpingNoTill) {
        ArrayList<Integer> result = new ArrayList<>();
        if (validateNo(jumpingNoTill))
            return result;

        for (int i = 0; i < jumpingNoTill; i++) {
            if (checkAdjacent(i))
                result.add(i);
        }
        return result;
    }

    private static boolean checkAdjacent(int num) {
        while (num != 0) {
            int d1 = num % 10;
            num /= 10;
            if (num != 0) {
                int d2 = num % 10;
                if (Math.abs(d1 - d2) != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean validateNo(int jumpingNoTill) {
        return jumpingNoTill < 0;
    }
}
