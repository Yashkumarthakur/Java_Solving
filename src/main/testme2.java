import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class vehicle {
    public void getMessage(String str) {
        System.out.println("this is vehicle class" + str);
    }
}

class car extends vehicle {
    public void getMessage(String str) {
        System.out.println("this is car class" + str);
    }
}

class test {
    public void testMessage(vehicle v) {
        v.getMessage("test1");
    }

    public void testMessage(car c) {
        c.getMessage("test2");
    }

    public static void main(String[] args) {
        test t1 = new test();
        vehicle v = new car();
        t1.testMessage(v);

        List<Integer> test12 = new ArrayList<>();
        test12.addAll(Arrays.asList(1,2,3,4,5,6));
        System.out.println(test12.size());
    }
}
