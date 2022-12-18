package com.pratmodi.reversestring;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringUsingWithoutAPI {

	public static void main(String[] args) {

		String str = "My name is Prateek Modi";
		char[] charArray = str.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for(int i=charArray.length-1;i>=0;i--) {
			list.add(charArray[i]);
		}

		for(char c:list) {
			System.out.print(c);
		}
		
		
	}

}
