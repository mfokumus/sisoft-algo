package com.mfokumus.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

// MyTree sınıfı
public class MyTree {
    private Trie trie;
    public MyTree(String fileName) {
        trie = new Trie();
        // Sözlük okuma işlemi
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                trie.insert(line.trim().toUpperCase()); // Sözlüğe her kelimeyi ekleyin ve büyük harfe dönüştürün
            }
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
    // Kelime arama metodu
    public List<String> findWords(String prefix) {
        return trie.findWords(prefix);
    }
}

