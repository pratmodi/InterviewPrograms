package hackerrank;

public class CountingValleys {
	private static int countValleys(String s) {
		int level = 0; // 0 is sea-level
		int valleys = 0;

		for (char c : s.toCharArray()) {
			if (c == 'U') {
				level++;
				if (level == 0) {
					valleys++;
				}
			} else {
				level--;
			}
		}
		return valleys;
	}

	public static void main(String[] args) {
		System.out.println(countValleys("UUUUDDUUUU"));
	}
}
