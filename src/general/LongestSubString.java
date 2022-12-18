package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// "abcabcabc"
// "abcdeabcde"

public class LongestSubString {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("abcabcabc");
		set.add("abcdeabcde");
		set.add("abcdefabcdef");
		set.add("abcdefzabcdefz");
		set.add("abcdeabcde");
		System.out.println(findSubstring(set));
	}

	
	public static String findSubstring(Set<String> set) {
		List<String> l = new ArrayList<String>(set);
		int[] countArray=new int[l.size()];
		int counter=0;
		int max = Integer.MIN_VALUE;
		int index =0;
		List<Integer> list = new ArrayList<Integer>();
		for(String s:set) {
			char[] array = s.toCharArray();
			for(int i=0;i<array.length;i++) {
				for(int j=i+1;j<array.length;j++) {
					if(array[i]!=array[j]) {
						counter++;
					}
					if(counter>max) {
						max = counter;
						countArray[index] = max;
					list.add(max);
					}
				}
			}index++;
		}
	
		int z = Integer.MIN_VALUE;
		
		for(int i=0;i<countArray.length;i++) {
			if(countArray[i]>z) {
				z = countArray[i];
			}
		}
		int indexOfSet = list.indexOf(z);
		int maxx = Collections.max(list);
		String answer = l.get(maxx);
	return answer;	
	}
	
}
