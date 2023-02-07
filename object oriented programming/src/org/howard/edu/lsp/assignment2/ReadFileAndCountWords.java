package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ReadFileAndCountWords {
   public static void main(String[] args) {
      URL url = ReadFileAndCountWords.class.getResource("main/java/resources/word.text");
      
      Map<String, Integer> wordCounts = new HashMap<>();
      
      try (InputStream is = url.openStream();
           BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
         String line;
         while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word : words) {
               word = word.toLowerCase();
               wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      System.out.println("Word Counts: " + wordCounts);
   }
}