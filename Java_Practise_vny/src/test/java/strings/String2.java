package strings;

public class String2 {

	public static void main(String[] args) {

		/*
		 * Count no of words present in string... here using trim() method of string..
		 * it helps to remove spaces from start to end of sentence.. trim() will not
		 * remove spaces from middle. ex: s =" java QA"; s.trim(); --> "java QA".
		 */

		String s = " I am a QA Test Engineer";
		System.out.println("Before trimming :" + s);
		String s1 = s.trim();
		System.out.println("After trimming :" + s1);
		int count = 1;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ' && s1.charAt(i + 1) != ' ') {
				count = count+1;
			}
		}
		System.out.println("No of words are :" + count);

	}
}
