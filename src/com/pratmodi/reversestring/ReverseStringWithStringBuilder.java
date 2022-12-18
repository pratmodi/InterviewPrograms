package com.pratmodi.reversestring;

public class ReverseStringWithStringBuilder {

	public static void main(String[] args) {

		String str = "My name is Prateek Modi";
		
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb.reverse());
		
	}

}
