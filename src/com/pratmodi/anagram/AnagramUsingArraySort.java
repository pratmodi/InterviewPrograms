package com.pratmodi.anagram;

import java.util.Arrays;

public class AnagramUsingArraySort {

	public static void main(String[] args) {
		String s1 = "Angel";
		String s2 = "Angle";
		
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		boolean b = String.valueOf(charArray1).equalsIgnoreCase(String.valueOf(charArray2));

		System.out.println(b);		
		
	}

}
