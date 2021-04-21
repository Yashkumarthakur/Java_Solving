package practice_concepts.data_structure.hash_map;

/**
 * To store the Map data in key and value pair.
 * Used linked list approach to avoid the collisions
 */
class Entry {
    final String key;
    String value;
    Entry next;

    Entry(String k, String v) {
        key = k;
        value = v;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", next=" + next +
                '}';
    }

    public String getKey() {
        return key;
    }
}