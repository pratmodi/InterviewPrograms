package hackerrank;

import java.util.List;

public class JumpingOnTheClouds {

	public static int jumpingOnClouds(List<Integer> l) {
		final int[] clouds = new int[l.size()];
		for (int i = 0; i < l.size(); i++) {
			clouds[i] = l.get(i);
		}
		int noOfJumps = 0, i = 0;
		while (true) {
			if (i + 2 < l.size() && clouds[i + 2] == 0) {
				i += 2;
			} else if (i + 1 < l.size()) {
				i++;
			} else {
				break;
			}
			noOfJumps++;
		}

		return noOfJumps;

	}

	public static void main(String[] args) {

	}
}
