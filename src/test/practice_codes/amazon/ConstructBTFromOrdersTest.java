package practice_codes.amazon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ConstructBTFromOrdersTest {
    @Test
    void bestCase1() {
        List<Integer> inOrder = new ArrayList<>(Arrays.asList(2, 1, 3));
        List<Integer> preOrder = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> postOrder = new ArrayList<>(Arrays.asList(2, 3, 1));

        Assertions.assertEquals(ConstructBTFromOrders.callForBuildTree(inOrder, preOrder, false), ConstructBTFromOrders.callForBuildTree(inOrder, postOrder, true));
    }

    /**
     * in : 2 5 3 6 4
     * pos : 5 2 6 4 3
     * <p>
     * pre : 3 2 5 4 6 ****
     */
    @Test
    void bestCase2() {
        List<Integer> inOrder = new ArrayList<>(Arrays.asList(2, 5, 3, 6, 4));
        List<Integer> preOrder = new ArrayList<>(Arrays.asList(3, 2, 5, 4, 6));
        List<Integer> postOrder = new ArrayList<>(Arrays.asList(5, 2, 6, 4, 3));

        Assertions.assertEquals(ConstructBTFromOrders.callForBuildTree(inOrder, preOrder, false), ConstructBTFromOrders.callForBuildTree(inOrder, postOrder, true));
    }

}