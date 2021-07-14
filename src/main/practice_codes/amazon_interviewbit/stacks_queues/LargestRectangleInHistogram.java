package practice_codes.amazon_interviewbit.stacks_queues;

import java.util.*;

class LargestRectangleInHistogram {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 6, 7, 8, 7, 6, 2));
        callForCalculateLargestRectangleInHistogram(input);
    }

    private static int callForCalculateLargestRectangleInHistogram(List<Integer> input) {
        System.out.println("Given input is :" + input);
        int result = calculateLargestRectangleInHistogram(input);
        System.out.println("Result is  : " + result);
        return result;
    }

    private static int calculateLargestRectangleInHistogram(List<Integer> hist) {
        Deque<Integer> s = new ArrayDeque<>();
        int result = 0;
        int top;
        int areaWithTop;
        int len = hist.size();

        int i = 0;
        while (i < len) { //1, 6, 7, 8, 7, 6, 2
            // If this bar is higher than the bar on top stack, push it to stack
            if (s.isEmpty() || hist.get(s.peek()) <= hist.get(i)){
                s.push(i);
                i++;
            }
                // If this bar is lower than top of stack, then calculate area of rectangle
                // with stack top as the smallest (or minimum height) bar. 'i' is
                // 'right index' for the top and element before top in stack is 'left index'
            else {
                top = s.pop(); // store the top index
                // pop the top

                // Calculate the area with hist[tp] stack as smallest bar
                areaWithTop = hist.get(top) * (s.isEmpty() ? i : i - s.peek() - 1);

                // update max area, if needed
                if (result < areaWithTop)
                    result = areaWithTop;
            }
        }

        // Now pop the remaining bars from stack and calculate area with every
        // popped bar as the smallest bar
        /*while (!s.empty()) {
            top = s.pop();
            areaWithTop = hist.get(top) * (s.empty() ? i : i - s.peek() - 1);

            if (result < areaWithTop)
                result = areaWithTop;
        }*/
        return result;
    }
}
