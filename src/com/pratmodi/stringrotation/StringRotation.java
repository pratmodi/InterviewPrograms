package com.pratmodi.stringrotation;

public class StringRotation {

	public static void main(String[] args) {

		String s1 = "Prat";
		String s2 = "Modi";
		String s3 = s1 + s1;
		
		if(s3.contains(s2))
			System.out.println("is rotation.");
		else
			System.out.println("Is not a rotation.");
		
	}

}
