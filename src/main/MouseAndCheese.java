import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MouseAndCheese {
    public static void main(String[] args) {
        try {

            List<List<Integer>> inputList = new ArrayList<>();
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter count of testcases to perform : ");
            int testCases = sc.nextInt();

            while (testCases != 0) {
                System.out.println("Enter no of cheese count: ");
                int inputLen = sc.nextInt();
                System.out.println("Enter weight of each cheese blocks, separated by spaces! eg.(8 5 10 100 10 5)");
                sc.nextLine();
                String inputs = sc.nextLine();
                String[] in = inputs.split(" ");
                List<Integer> temp = new ArrayList<>();
                for (int i = 0; i < inputLen; i++) {
                    temp.add(Integer.valueOf((in[i]).trim()));
                }
                inputList.add(temp);
                testCases--;
            }

            for (List<Integer> l : inputList) {
                System.out.println("Given cheese blocks are : " + l);
                System.out.println("Result is :" + findMaxCheese(l));
            }
        } catch (Exception e) {
            System.err.println("Problem with input :" + e.toString());
        }
    }

    protected static int findMaxCheese(List<Integer> input) {
        if (input == null || input.isEmpty()) return 0;
        int initial = input.get(0);
        int max = 0;

        for (int i = 1; i < input.size(); i++) {
            int maxNew = Math.max(initial, max);
            initial = max + input.get(i);
            max = maxNew;
        }
        return Math.max(initial, max);
    }
}