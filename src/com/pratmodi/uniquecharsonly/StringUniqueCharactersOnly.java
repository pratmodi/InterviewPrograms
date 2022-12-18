package com.pratmodi.uniquecharsonly;

public class StringUniqueCharactersOnly {

	public static void main(String[] args) {

		String s = "Pratek";
		System.out.println(check(s));
	}
	
	public static boolean check(String s) {
		
		char[] array = s.toCharArray();
		
		for(char c: array) {
			if((s.indexOf(c)!=s.lastIndexOf(c))) {
				return false;
			}
		}
		return true;
	}

}
