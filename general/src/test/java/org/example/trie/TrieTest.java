package org.example.trie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {
    Trie trie = new Trie();

    @Test
    void test1(){
        trie.insert("apple");
        boolean apple = trie.search("apple");
        boolean appe = trie.searchPrefix("appl");

        Assertions.assertEquals(true, apple);
        Assertions.assertEquals(true, appe);

    }
}