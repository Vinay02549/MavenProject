
package strings;

public class StringMethods {

	public static void main(String[] args) {
		/*
		 * ......String Methods...... toUpperCase():String - is to convert string into
		 * uppercase. toLowerCase():String - is to convert string into lowercase.
		 * startswith(string):boolean - check whether string is ending with given string
		 * or not. endswith(string):boolean - check whether string is ending with given
		 * string or not. contains(string):boolean - checks whether string is present in
		 * given string or not. isEmpty():boolean - checks whether string is empty or
		 * not. object.concat(string) - concatinates string in end of called string.
		 * replace method -
		 */

		String s = "Java QA Engineer";
		String up = s.toUpperCase();
		String lo = s.toLowerCase();
		System.out.println(up);
		System.out.println(lo);
		System.out.println("starts with method : " + s.startsWith("na"));
		System.out.println("ends with method : " + s.endsWith("raj"));
		System.out.println("contains with method : " + s.contains("va"));
		String s1 = "";
		System.out.println("is empty method : " + s1.isEmpty());

		System.out.println("---------- replace method-------");
		String p = "java development";
		String r1 = p.replace('e', 'a');
		System.out.println(r1);
		String r2 = p.replaceAll("java", "core java");
		System.out.println(r2);

	}
}
