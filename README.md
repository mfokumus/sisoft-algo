# Trie (Ağaç) Veri Yapısı ile Sözlük Kelime Arama Uygulaması

## Problem Tanımı

Verilen bir sözlük dosyasındaki kelimeleri hafızaya yüklemeden, bir Trie yapısı kullanarak belirli bir kelime için olası eşleşmeleri bulmamız istenmiştir. Bu uygulama, kullanıcının bir kelime girdiğinde bu kelimeye uygun olası kelimeleri bulabilmelidir.

## Çözüm Yapısı

Bu projede, Trie (Ağaç) veri yapısını kullanarak sözlük dosyasındaki kelimeleri hafızaya yükleyen ve olası eşleşmeleri bulmak için bu yapının kullanıldığı bir Java uygulaması geliştirilmiştir. Projenin yapısı şu şekildedir:

- **TrieNode**: Trie yapısında her bir düğümü temsil eden sınıf.
- **Trie**: Trie yapısını yöneten sınıf. Kelimelerin eklenmesi ve aranması gibi temel işlemleri gerçekleştirir.
- **MyTree**: Sözlük dosyasındaki kelimeleri Trie yapısına yükleyen sınıf.
- **Main**: Kullanıcı arayüzü ve uygulamanın çalıştırıldığı ana sınıf.

## Nasıl Kullanılır?

1. Proje klasöründe bulunan `sozluk.txt` dosyasını kullanarak projeyi çalıştırın.
2. Konsola `Java Main sozluk.txt` komutunu girin.
3. Programın yönergelerini takip ederek bir kelime yazın ve olası eşleşmeleri görün.

## Örnek Çıktılar

Sözlük Yükleniyor. Lütfen Bekleyin...
Sözlük Yüklendi.

Bir Kelime Yazıp Enter Tuşuna Basınız

BROWSA

Olası Kelimeler

BROWSABLE
BROWSABLES

Bir Kelime Yazıp Enter Tuşuna Basınız
..
..
..
..


