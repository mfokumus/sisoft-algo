package com.mfokumus;

import com.mfokumus.files.FilePathUrl;
import com.mfokumus.files.MyTree;

import java.util.Scanner;
import java.util.List;

// Ana sınıf
public class Main {
    public static void main(String[] args) {
        String pathFileName = "\\sozluk.txt";
        String pathDirectoryName = FilePathUrl.MY_FILE_PATH_URL;
        String url = pathDirectoryName.concat(pathFileName);

        MyTree myTree = new MyTree(url);
        System.out.println("Sözlük Yüklendi.");
        System.out.println("Bir Kelime Yazıp Enter Tuşuna Basınız");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.isEmpty())
                continue;
            if (input.equals("EXIT"))
                break;

            List<String> possibleWords = myTree.findWords(input);
            if (possibleWords.isEmpty()) {
                System.out.println("Olası Kelimeler Bulunamadı");
            } else {
                System.out.println("Olası Kelimeler:");
                for (String word : possibleWords) {
                    System.out.println(word);
                }
            }

            System.out.println("Bir Kelime Yazıp Enter Tuşuna Basınız (Çıkmak için EXIT yazabilirsiniz)");
        }

        scanner.close();
    }
}
