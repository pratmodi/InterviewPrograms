package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondLargestNonRepeatingNumber {

	public static void main(String[] args) {

		int[] array = { 4, 4, 6, 1, 2, 3, 5, 5 };
		System.out.println(process(array));
	}

	public static int process(int[] array) {
		Arrays.sort(array);
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int count = array.length;
		int index = 0;
		while(count>0) {
			
			if(map.containsKey(array[index])) {
				map.put(array[index], map.get(array[index])+1);
			}else {
				map.put(array[index], 1);
			}
			index++;
			count--;
		}

		List<Integer> list = new ArrayList<Integer>();
		
	for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
		if(entry.getValue()==1) {
				list.add(entry.getKey());
		}
		Collections.sort(list);
	}

		return list.get(list.size()-2);
	}

}
