package polymorphism;

public class Add {
// method overloading...
	public static void add() {
		System.out.println(100 + 200);
	}

	public static void add(int i, int j) {
		System.out.println(i + j);
	}

	public static void add(char ch1, char ch2) {
		System.out.println(ch1 + ch2);
	}

	public static void add(int i, String s) {
		System.out.println(i + s);
	}

	public static void add(String s, int i) {
		System.out.println(s + i);
	}

	public static void main(String[] args) {
		add();
		add(500, 500);
		add(5, 5);
		add(200, "java");
		add("sql", 500);
	}
}
