package general;

public class StringRecursion {

	public static void main(String[] args) {
System.out.println(reverseString("Prateek"));

	}

	public static String reverseString(String str){
	
	String substr = rev(str.length()-1,str,0);
	return substr;
	}

	public static String rev(int start, String str, int end) {
		return str.substring(str.length() - 1, 0) + rev(0, str, str.length() - 1);
	}
}
