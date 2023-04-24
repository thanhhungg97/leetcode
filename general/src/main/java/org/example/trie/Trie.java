package org.example.trie;

public class Trie {

    TrieNode root;

    Trie() {

        root = new TrieNode();
    }

    void insert(String s) {
        char[] chars = s.toCharArray();

        TrieNode curNode = root;
        for (char aChar : chars) {
            if (!curNode.contains(aChar)) {
                curNode.put(aChar, new TrieNode());
            }
            curNode = curNode.get(aChar);
        }
        curNode.setEnd();
    }

    boolean searchPrefix(String s) {
        char[] chars = s.toCharArray();

        TrieNode curNode = root;
        for (char aChar : chars) {
            if (!curNode.contains(aChar)) {
                return false;
            }
            curNode = curNode.get(aChar);
        }
        return true;
    }

    boolean search(String s) {
        char[] chars = s.toCharArray();

        TrieNode curNode = root;
        for (char aChar : chars) {
            if (!curNode.contains(aChar)) {
                return false;
            }
            curNode = curNode.get(aChar);
        }
        return curNode != null && curNode.isEnd;
    }
}
