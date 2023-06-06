package practice_codes.amazon_interviewbit.linked_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class AddTwoNumbersAsListsTest {
    @Test
    void bestCase(){
        Assertions.assertEquals(LLNode.addNodes(Arrays.asList(0)),
                AddTwoNumbersAsLists.callForAddTwoNumbersAsLists
                        (LLNode.addNodes(Arrays.asList(0)),LLNode.addNodes(Arrays.asList(0))));

        Assertions.assertEquals(LLNode.addNodes(Arrays.asList(2,3,9,6)),
                AddTwoNumbersAsLists.callForAddTwoNumbersAsLists
                        (LLNode.addNodes(Arrays.asList(2,3,4)),LLNode.addNodes(Arrays.asList(0,0,5,6))));

        Assertions.assertEquals(LLNode.addNodes(Arrays.asList(1,0,0,1)),
                AddTwoNumbersAsLists.callForAddTwoNumbersAsLists
                        (LLNode.addNodes(Arrays.asList(1,1,9)),LLNode.addNodes(Arrays.asList(0,9))));

        Assertions.assertEquals(LLNode.addNodes(Arrays.asList(8,0,1)),
                AddTwoNumbersAsLists.callForAddTwoNumbersAsLists
                        (LLNode.addNodes(Arrays.asList(9,9)),LLNode.addNodes(Arrays.asList(9))));
    }

}