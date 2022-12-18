package com.pratmodi.firstnonrepeatedchar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharInString {

	public static void main(String[] args) {

		String str = "MynameisPrateekModi";
		System.out.println(check(str));
	}

	public static Character check(String str) {
		char[] array = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char c : array) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}

		for (Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() == 1)
				return e.getKey();

		}
		return null;
	}
}
