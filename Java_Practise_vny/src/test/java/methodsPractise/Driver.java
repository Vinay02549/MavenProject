package methodsPractise;

public class Driver {
// method overriding...

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.car();
		p1.carname();
		Son s1 = new Son();
		s1.car();
		s1.carname();
		Daughter d1 = new Daughter();
		d1.car();
		d1.carname();
	}
}
