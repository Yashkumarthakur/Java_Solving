package practice_concepts.data_structure.hash_map;

public class MyHashMap<S, S1> {
    // for better re-sizing is taken as 2^4
    private static final int SIZE = 16;

    private final Entry[] table = new Entry[SIZE];


    /**
     * Returns the entry mapped to key in the HashMap.
     */
    public Entry get(String k) {
        int hash = k.hashCode() % SIZE;
        Entry e = table[hash];

        // Bucket is identified by hashCode and traversed the bucket
        // till element is not found.
        while (e != null) {
            if (e.key.equals(k)) {
                return e;
            }
            e = e.next;
        }
        return null;
    }

    /**
     * If the map previously contained a mapping for the key, the old
     * value is replaced.
     */
    public void put(String k, String v) {
        int hash = k.hashCode() % SIZE;
        Entry e = table[hash];

        if (e != null) {
            // If we will insert duplicate key-value pair,
            // Old value will be replaced by new one.
            if (e.key.equals(k)) {
                e.value = v;
            } else {
                // Collision: insert new element at the end of list
                // in the same bucket
                while (e.next != null) {
                    e = e.next;
                }
                e.next = new Entry(k, v);
            }
        } else {
            // create new bucket for new element in the map.
            Entry entryInNewBucket = new Entry(k, v);
            table[hash] = entryInNewBucket;
        }
    }
}