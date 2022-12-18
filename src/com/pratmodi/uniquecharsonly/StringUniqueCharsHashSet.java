package com.pratmodi.uniquecharsonly;

import java.util.HashSet;
import java.util.Set;

public class StringUniqueCharsHashSet {

	public static void main(String[] args) {

		System.out.println("java2blog has all unique chars : " + hasAllUniqueChars("java2blog"));
		System.out.println("Apple has all unique chars : " + hasAllUniqueChars("apple"));
		System.out.println("index has all unique chars : " + hasAllUniqueChars("index"));
		System.out.println("world has all unique chars : " + hasAllUniqueChars("world"));
	}

	private static boolean hasAllUniqueChars(String string) {
		
		Set<Character> alphaSet = new HashSet<Character>();
		
		for(int i=0;i<string.length();i++) {
			
			char c = string.charAt(i);
			
			if(!alphaSet.add(c))
				return false;
			
		}
		
		return true;
	}

}
