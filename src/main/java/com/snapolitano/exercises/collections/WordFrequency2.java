package com.snapolitano.exercises.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency2 {
	public static Map<String, Integer> wordFrequency(String filename) throws IOException {
		Map<String, Integer> map = new HashMap<>();
		for (String line : getLines(filename)) {
			for (String word : lineToWords(line)) {
				if (map.containsKey(word)) {
					map.put(word, map.get(word) + 1);
				} else {
					map.put(word, 1);
				}
			}
		}
		return map;
	}

	public static List<String> getLines(String filename) throws IOException {
		return Files.readAllLines(Path.of(filename));
	}

	public static List<String> lineToWords(String line) {
		return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
	}
}
