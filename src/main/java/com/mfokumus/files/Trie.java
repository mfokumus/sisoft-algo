package com.mfokumus.files;

import java.util.ArrayList;
import java.util.List;

// Trie veri yapısını yöneten sınıf
class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Trie'ye kelime ekleme metodu
    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'A'; // Harfi Trie dizisi indeksine dönüştürme
            if (current.children[index] == null)
                current.children[index] = new TrieNode();
            current = current.children[index];
        }
        current.isEndOfWord = true; // Kelimenin sonunu işaretle
    }

    // Trie'de kelime arama metodu
    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'A';
            if (current.children[index] == null)
                return false;
            current = current.children[index];
        }
        return current != null && current.isEndOfWord;
    }

    // Trie'deki kelimenin olası kelimelerini bulan metot
    public List<String> findWords(String prefix) {
        TrieNode current = root;
        List<String> words = new ArrayList<>();
        // Prefix'i Trie'de takip etme
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'A';
            if (current.children[index] == null)
                return words;
            current = current.children[index];
        }
        // Prefix'ten sonraki tüm olası kelimeleri bulma
        findWordsUtil(current, prefix, words);
        return words;
    }

    // Yardımcı metot: Verilen düğümden başlayarak tüm olası kelimeleri bulma
    private void findWordsUtil(TrieNode node, String prefix, List<String> words) {
        if (node == null)
            return;
        if (node.isEndOfWord)
            words.add(prefix);
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                char ch = (char) ('A' + i); //ASCII Code
                findWordsUtil(node.children[i], prefix + ch, words);
            }
        }
    }
}