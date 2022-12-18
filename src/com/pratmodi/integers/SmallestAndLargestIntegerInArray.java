package com.pratmodi.integers;

public class SmallestAndLargestIntegerInArray {

	public static void main(String[] args) {

		int[] array = {23,21,245,22,123,19,23,19,25};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
			}
			if(array[i]<min) {
				min = array[i];
			}
		}
		
		System.out.println("MAX Num is: "+max);
		System.out.println("MIN Num is: "+min);
		
	}
	
}
