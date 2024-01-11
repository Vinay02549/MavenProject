package arrays;

public class Array2 {

	public static void main(String[] args) {

		int a[] = new int[3];
		System.out.println(a[0]); // output : 0
		System.out.println(a[1]); // 0
		System.out.println(a[2]); // 0

		// storing elements in an array..
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		// Retrieving
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

		// storing string type data ..

		String[] s = new String[3];
		s[0] = "Vinay";
		s[1] = "kedar";
		s[2] = "Anjani";

		// retrieving
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);

		// direct declaration in an array...
		String w[] = { "Hai", "vinay", "welcome", "To", "Java" };
		System.out.println(w[0]);
		System.out.println(w[1]);
		System.out.println(w[2]);
		System.out.println(w[3]);
		System.out.println(w[4]);

		// using length method in array.... we know the size of an array..
		System.out.println(w.length);

	}
}
