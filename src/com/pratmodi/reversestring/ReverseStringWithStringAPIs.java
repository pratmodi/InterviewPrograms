package com.pratmodi.reversestring;

public class ReverseStringWithStringAPIs {

	public static void main(String[] args) {

		String str = "Harry Potter Wand";
		
		System.out.println(reversed(str));
		
		
	}
	
	public static String reversed(String s) {
		
		if(s==null||s.isEmpty())
			return s;
		
		return s.charAt(s.length()-1) + reversed(s.substring(0, s.length()-1));
		
	}

}
