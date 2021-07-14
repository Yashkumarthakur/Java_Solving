import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class ShoppingPriceTest {
    @Test
    void bestCase(){
        ArrayList<String> inputData= new ArrayList<>();
        inputData.add("Rajan Patil, Aundh, 1, Phone Cover, Rs 170, Cash");
        inputData.add("Mohit Gupta, Baner, 1, Samsung Battery, Rs 900, Credit Card");
        inputData.add("Rajan Patil, Aundh, 3, Samsung Battery, Rs 1000, Cash");
        inputData.add("Nina Kothari, Baner, 4, Earphones, Rs 500, Credit Card");
        inputData.add("Sunitha, Shivajinagar, 5, Earphones, Rs 550, Credit Card");
        inputData.add("Rohan Gade, Aundh, 10, Motorola Battery, Rs 1000, Credit Card");
        inputData.add("Rajan Patil, Aundh, 22, USB Cable, Rs 150, UPI");
        inputData.add("Meena Kothari, Baner, 23, USB Cable, Rs 100, Cash");
        inputData.add("Nina Kothari, Baner, 24, USB Cable, Rs 200, UPI");
        inputData.add("Mohit Gupta, Baner, 25, USB Cable, Rs 150, UPI");

        Assertions.assertEquals(new ArrayList<>(Arrays.asList("Mohit Gupta","Meena Kothari")), ShoppingPrice.processData(inputData));

        inputData.add("Meena Kothari, Baner, 23, USB Cable, Rs 200, Cash");
        Assertions.assertEquals(new ArrayList<>(Arrays.asList("Mohit Gupta")), ShoppingPrice.processData(inputData));
    }

}