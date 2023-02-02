package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
   
public class WordCounting   {
	
	//this const contains Words we don't count
	private static final List<String> EXCLUDEWORDS =
			Arrays.asList("and", "the", "what", "is", "for", "by", "of", "it", "a");
    public static void main(String[] args) throws FileNotFoundException {
    	TreeMap<String, Integer> map = new TreeMap<String, Integer>();
    	Scanner txtFile = new Scanner (new File ("C:\\Users\\User\\Desktop\\word count.txt"));
    	while (txtFile.hasNext()) {
    		String word = txtFile.next();
    		if (EXCLUDEWORDS.contains(word))
    			continue;
    		int count = 1;
    		if (map.containsKey(word)) {
    			count = map.get(word) + 1;
    		}
    		map.put(word, count);
    	}
    	txtFile.close();
    	
    	for (Map.Entry<String, Integer> entry: map.entrySet()) {
    		System.out.println(entry);
    	}
    }  
}  