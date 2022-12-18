package com.pratmodi.substringsinastring;

import java.util.HashSet;
import java.util.Set;

public class SubstringsInAString {

	public static void main(String[] args) {

		String str = "abcabcbb";
		System.out.println(get(str));
	}

	public static Set get(String str) {

		Set permutationSet = new HashSet(); 
		
		if(str.equals("")||str.isEmpty()) {
			permutationSet.add("");
			return permutationSet;
		}
		
		char firstChar = str.charAt(0);
		
		String rem = str.substring(1);
		
		Set<String> permutedSetForRemainingString = get(rem);
		
		for(String permutedString:permutedSetForRemainingString) {
			for(int i=0;i<str.length();i++) {
				String permutation = insertFirstCharAtDiffPlaces(permutedString,firstChar,i);
				permutationSet.add(permutation);
			}
		}
		return permutationSet;
	}

	private static String insertFirstCharAtDiffPlaces(String permutedString, char firstChar, int i) {
		return permutedString.substring(0, i)+firstChar+permutedString.substring(i);
	}
	
}
