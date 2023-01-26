package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class FileReader {
	public String readToString(String resources) throws FileNotFoundException {
		URL url = getClass().getClassLoader().getResource(resources);
		
		System.out.println(url.getPath());
		
		if (url != null) {
			File file = new File(url.getPath());
			
			Scanner sc = null;
			try {
				sc = new Scanner(file);
				String output = "";
				while (sc.hasNextLine()) {
					output = output + sc.nextLine() + " ";
