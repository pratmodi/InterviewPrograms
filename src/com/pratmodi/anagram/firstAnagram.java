package com.pratmodi.anagram;

public class firstAnagram {

	public static void main(String[] args) {

		String s1 = "Angel";
		String s2 = "Angleee";
		
		char[] charArray1  = new char[s1.length()];
		char[] charArray2  = new char[s2.length()];
		
		for(char i:charArray1) {
			if(s1.indexOf(charArray1[i])==s1.lastIndexOf(charArray1[i])&&s2.indexOf(charArray2[i])==s2.lastIndexOf(charArray2[i])) {
				System.out.print(charArray1[i]+" & "+charArray2[i]);
				System.out.println();
			}
			
		}
		
	}

}
