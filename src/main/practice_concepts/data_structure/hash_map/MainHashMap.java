package practice_concepts.data_structure.hash_map;

public class MainHashMap {
    public static void main(String[] args) {
        MyHashMap<String,String> myHashMap = new MyHashMap();

        myHashMap.put("Awadh", "SSE");
        myHashMap.put("Rahul", "SSE");
        myHashMap.put("Sattu", "SE");
        myHashMap.put("Gaurav", "SE");

        Entry e = myHashMap.get("Awadh");
        System.out.println(""+e.getValue());
        System.out.println(myHashMap);
    }
}
