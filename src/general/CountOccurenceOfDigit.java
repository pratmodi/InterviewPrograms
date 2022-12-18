package general;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountOccurenceOfDigit {
	public static void main(String[] args) {
		  List<Integer> numbers = Arrays.asList(400, 1, 2, 3, 4, 545, 10, 11, 12, 13,44, 14, 15);
//		  for(int i = 0; i < 10; i++) {
//		    System.out.println("Digit: " + i + " -> Ocurrences: " + countDigit(i, numbers));
//		  }
		  System.out.println(countDigit(4, numbers));
		}

		public static long countDigit(int target, List<Integer> numbers) {
		  return numbers.stream().map(Object::toString) // Convert each number to string
		                .collect(Collectors.joining()) // Join all of them into single string
		                .chars() // Give me a stream of its characters
		                .filter(c -> c == Character.forDigit(target, 10)) // I just want the ones that are the same as my target
		                .count(); // How many of them are there?
		}
}
