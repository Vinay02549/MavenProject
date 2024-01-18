package super_keyword;

public class B1 extends A1 {

	public B1() {
		this(99);
		System.out.println(" B class default constructor");
	}

	public B1(int i) {
		// super(); //default call to super..
		System.out.println(" B class integer constructor");
	}

}
