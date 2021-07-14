import java.util.*;

public class testme {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        int[] a1 = new int[]{2,45,64,84,5,48,21,68,7,123,48,213,83,18,21,3,131,684,6,3,51,81,3};
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));

        HashMap<Integer,String> hm = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        PriorityQueue test = new PriorityQueue();

        List exampleList = new ArrayList<>();
        exampleList.add(31564);
        exampleList.add("asdkjad");
        exampleList.add(3213.12f);
        exampleList.add(new Object());

        for (int i = 0; i < exampleList.size(); i++) {
            System.out.println(exampleList.get(i).getClass());
        }


        PriorityQueue<Integer> testQues = new PriorityQueue<>((a,b) -> b-a);

        for (int i = 10; i > 0; i--) {
            testQues.add(i+10);
        }
        for (int i :testQues){
            System.out.println(i);
        }



        List<Integer> findMedian = new ArrayList<>(Arrays.asList(5,15,1,3));
        List<Integer> temp = new ArrayList<>();
                findMedian.stream().forEach(e -> {
             if(temp.size() <= 1){
                 temp.add(e);
                 System.out.println(temp.size() == 2 ? (temp.get(0)+temp.get(1))/2 : e);
             } else{
                 temp.add(e);
                 Collections.sort(temp);
                 int median = temp.size() / 2;
                 System.out.println(median % 2 == 0 ? ((temp.get(median)+temp.get(median-1))/2) : temp.get(median).intValue() );
             }
        });



    }
}
