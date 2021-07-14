package practice_codes.amazon_interviewbit.stacks_queues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GenerateAllParenthesesTest {
    @Test
    void bestCase() {
        Assertions.assertEquals(false, GenerateAllParentheses.callForIsValidParentheses("{})}{(}"));
        Assertions.assertEquals(true, GenerateAllParentheses.callForIsValidParentheses("{{{{}}}}"));
        Assertions.assertEquals(true, GenerateAllParentheses.callForIsValidParentheses("{([])}"));
        Assertions.assertEquals(true, GenerateAllParentheses.callForIsValidParentheses("{{((((({{{{{{[[[[[[]]]]]]}}}}}})))))}}"));
    }

    @Test
    void cornerCase() {
        Assertions.assertEquals(false, GenerateAllParentheses.callForIsValidParentheses(""));
        Assertions.assertEquals(false, GenerateAllParentheses.callForIsValidParentheses("{{{{{{{{{{{{{{{{"));
        Assertions.assertEquals(false, GenerateAllParentheses.callForIsValidParentheses("}}}}}}}}}"));
        Assertions.assertEquals(false, GenerateAllParentheses.callForIsValidParentheses(null));
    }

}