import java.util.*;

public class TestingPrograms {

    static public void main(String[] args) {
        testTryExample();
        testStringExample();
        testForArrayList();
        testForTreeSet();
        System.out.println("00121210".substring(0, "00121210".length() - 1));


    }

    private static void testForTreeSet() {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("one");
        ts.add("two");
        ts.add("three");
        ts.add("one");
        ts.forEach(System.out::println);
    }

    private static void testForArrayList() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        list.add(1,10);
        list.stream().forEach(System.out::println);

    }

    private static void testStringExample() {
        String a = "ABC";
        String b = new String(a.toLowerCase());
        b.replace("a", "d");
        b.replace("b", "c");
        System.out.println(b);
    }

    private static void testTryExample() {
        try {
            int i = 10;
            i -= 10;
            if (i == 0) {
                return;
//                break;
            }
            System.out.println(50 / i);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("In finally");
        }
        System.out.println("out of try");
    }
}
