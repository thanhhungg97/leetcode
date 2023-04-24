package org.example.trie;

public class TrieNode {
    TrieNode[] arr = new TrieNode[26];
    boolean isEnd;


    public TrieNode() {
    }

    boolean contains(char c) {
        return arr[c - 'a'] != null;
    }

    TrieNode get(char c) {
        return arr[c - 'a'];
    }

    void setEnd() {
        this.isEnd = true;
    }

    void put(char c, TrieNode node) {
        arr[c - 'a'] = node;
    }
}
