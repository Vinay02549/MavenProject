package constructors;

public class Student {
	// No argument constructor....

	String name;

	// defining constructor..
	public Student() {
		name = "John";
	}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.name);
		Student s2 = new Student();
		System.out.println(s2.name);
		Student s3 = new Student();
		System.out.println(s3.name);
	}

}
