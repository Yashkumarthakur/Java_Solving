package practice_codes.amazon_interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Java implementation of search and insert operations
// on Trie
public class TrieExample {
    // Alphabet size (# of symbols)
    static final int ALPHABET_SIZE = 26;
    static TrieNode root;

    public static void main(String args[]) {
        List<String> keys = new ArrayList<>(Arrays.asList("happy", "rise", "for", "set", "sunrise", "su", "nset", "sunset", "mind", "happymind", "n", "rise", "happysunrise"));
        String output[] = {"Not present in trie", "Present in trie"};

        root = new TrieNode();
        for (int i = 0; i < keys.size(); i++)
            insert(keys.get(i));


        GetFormedWords(root);

        // Search for different keys
        if (search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);

        if (search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);

        if (search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);

        if (search("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);

    }


    // trie node
    static class TrieNode {
        TrieNode[] nodes = new TrieNode[ALPHABET_SIZE];
        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;
        int count_of_eow;
        List<String> words;

        TrieNode() {
            isEndOfWord = false;
            count_of_eow = 0;
            words = null;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                nodes[i] = null;
        }
    }

    ;


    // If not present, inserts key into trie
    // If the key is prefix of trie node,
    // just marks leaf node
    static void insert(String key) {
        int level;
        int length = key.length();
        int index;
        List<String> formedWords;

        TrieNode trieTravel = root;

        for (level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';
            if (trieTravel.nodes[index] == null) {
                trieTravel.nodes[index] = new TrieNode();
            }
            trieTravel = trieTravel.nodes[index];
//            trieTravel.
        }

        // mark last node as leaf
        trieTravel.isEndOfWord = true;
        trieTravel.count_of_eow += 1;
        trieTravel.words = Arrays.asList(key);
    }

    // Returns true if key presents in trie, else false
    static boolean search(String key) {
        int level;
        int length = key.length();
        int index;
        TrieNode pCrawl = root;

        for (level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';

            if (pCrawl.nodes[index] == null)
                return false;

            pCrawl = pCrawl.nodes[index];
        }

        return (pCrawl != null && pCrawl.isEndOfWord);
    }


    private static void GetFormedWords(TrieNode root) {
        HashMap<String, List<String>> result = new HashMap<>();

    }
}
// This code is contributed by Sumit Ghosh
