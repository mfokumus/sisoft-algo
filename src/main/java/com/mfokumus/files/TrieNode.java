package com.mfokumus.files;

// Trie düğümlerini temsil eden sınıf
class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;
    public TrieNode() {
        children = new TrieNode[26]; // 26 karakterlik İngilizce alfabe için
        isEndOfWord = false;
    }
}
