package com.java8.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostWords {
	public static void main(String[] args) {
		Map<String, Integer> wordsCount = new HashMap<String, Integer>();
		BufferedReader reader = null;
		try {
			// creating objects
			reader = new BufferedReader(new FileReader("/Users/rajendrabasnet/Desktop/untitled.txt"));
			String currentLine = reader.readLine();

			while (currentLine != null) {
				String[] words = currentLine.toLowerCase().split(" ");

				for (String word : words) {

					if (wordsCount.containsKey(word)) {
						wordsCount.put(word, wordsCount.get(word) + 1);
					} else {
						wordsCount.put(word, 1);
					}
				}
				currentLine = reader.readLine();

			}
			String mostRepeated = null;
			int count = 0;
			Set<Entry<String, Integer>> entrySet = wordsCount.entrySet();

			for (Entry<String, Integer> entry : entrySet) {
				if (entry.getValue() > count) {
					mostRepeated = entry.getKey();
					count = entry.getValue();
				}
			}
			System.out
					.println("The most repeated word is " + mostRepeated + " and is repeated " + "" + count + " times");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
