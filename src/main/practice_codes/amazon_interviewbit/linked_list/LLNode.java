package practice_codes.amazon_interviewbit.linked_list;

import java.util.List;
import java.util.Objects;

public class LLNode {
    int data;
    LLNode next;
    LLNode random;

    public LLNode(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }

    public LLNode(int data, LLNode next, LLNode random) {
        this.data = data;
        this.next = next;
        this.random = random;
    }

    /**
     * Create linked List from list
     *
     * @param l : list of integer.
     * @return : Linked List.
     */
    public static LLNode addNodes(List<Integer> l) {
        if (l == null || l.isEmpty()) return null;
        LLNode h = null;
        for (int i = l.size() - 1; i >= 0; i--) {
            LLNode n = new LLNode(l.get(i));
            n.next = h;
            h = n;
        }
        return h;
    }

    @Override
    public String toString() {
        return "LLNode{" +
                "data=" + data +
                ", next=" + next +
                ", random=" + random +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LLNode that = (LLNode) o;
        return data == that.data && Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }
}
