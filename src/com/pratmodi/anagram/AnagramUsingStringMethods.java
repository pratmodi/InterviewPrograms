package com.pratmodi.anagram;

public class AnagramUsingStringMethods {

	public static void main(String[] args) {
		String word = "java2blog";
        String anagram = "aj2vabgol";
        System.out.println(isAnagram(word, anagram));
	}

	public static boolean isAnagram(String word,String anagram) {
		
		if(word.length()!=anagram.length())
			return false;
		
		for(int i=0;i<word.length();i++) {
			char c = word.charAt(i);
			int index = anagram.indexOf(c);
			
			if(index!=-1) {
				anagram = anagram.substring(0,index) + anagram.substring(index+1, anagram.length());
				
			}else {
				return false;
			}
		}
		return anagram.isEmpty();
		
	}
	
}
