package gold_man_s;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TravelFundTest {

    @Test
    void validCase() {
        List<Integer> input = convertArrayList(new ArrayList<>(Arrays.asList(2, 3, -3)));
        Assertions.assertEquals(0, TravelFund.requiredAmountAtStart(input));
    }

    @Test
    void validCaseWithOneIn() {
        List<Integer> input = convertArrayList(new ArrayList<>(Arrays.asList(-1)));
        Assertions.assertEquals(2, TravelFund.requiredAmountAtStart(input));
    }

}
