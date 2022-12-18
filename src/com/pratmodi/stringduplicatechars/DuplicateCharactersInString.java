package com.pratmodi.stringduplicatechars;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharactersInString {

	public static void main(String[] args) {

		String str = "Prateek Modi is";

		checkDuplicates(str);

	}

	public static void checkDuplicates(String str) {

		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey() + " number of times is: " + entry.getValue());
			System.out.println();
		}
	}

}
