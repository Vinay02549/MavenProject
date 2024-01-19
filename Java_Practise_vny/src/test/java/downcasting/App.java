package downcasting;

public class App {

	public static void main(String[] args) {

		// upcasted object..
		Student s = new Admin();
		s.view();
		// s.edit(); compile time error...

		// down casting object..

		Admin a = (Admin) s;
		a.edit();
		a.view();

	}

}
