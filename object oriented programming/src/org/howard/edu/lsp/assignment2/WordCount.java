package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class WordCount {
  
  public static void main(String[] args) {
    // Create a HashMap to store the word count
    HashMap<String, Integer> wordCount = new HashMap<>();

    // Read the file
    File file = new File("C:\\Users\\User\\git\\LSP_-MKJAVA-\\object oriented programming\\src\\main\\resources\\word count.txt");
    try (Scanner scanner = new Scanner(file)) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine().toLowerCase();
        String[] words = line.split("\\W+");
        for (String word : words) {
          if (word.length() > 3) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
          }
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + file);
    }

    // Print the word count
    for (String word : wordCount.keySet()) {
      System.out.println(word + ": " + wordCount.get(word));
    }
  }
}