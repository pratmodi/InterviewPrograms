package hackerrank;

//	  aba
// input = 10
// output = 7

public class RepeatedString {

	public static long repeatedString(String s, long n) {

		long numberOfReps = n/s.length();
        long remainder = n%s.length();
        long total = 0;
        for(int a = 0; a < s.length(); a++){
            if(s.charAt(a) == 'a'){
                total++;
            }
        }
        total = total * numberOfReps;
        for(int a = 0; a < remainder; a++){
             if(s.charAt(a) == 'a'){
                total++;
            }
        }
		return total;

	}

	public static void main(String[] args) {
		System.out.println(repeatedString("aba", 1000000000000L));
	}

}
