package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Driver {
	public static void main(String[] args) {
		String filePath = "src/main/java/resources/word.text";
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			Map<String, Integer> wordCounts = new HashMap<>();
			while ((line = br.readLine()) != null) {
				String[] words = line.split(" ");
				for (String word : words) {
					word = word.toLowerCase();
					if (word.length() <= 3) {
						continue;
					}
