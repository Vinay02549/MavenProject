package strings;

public class Reversestring {

	public static void main(String[] args) {

		/*
		 * Reverse p\of a String...
		 * 
		 */

		String actual = "javaQA";
		String rev = "";
		for (int i = actual.length() - 1; i >= 0; i--) {
			rev = rev + actual.charAt(i);
		}
		System.out.println("reverse of a string is :" + rev);

	}
}
