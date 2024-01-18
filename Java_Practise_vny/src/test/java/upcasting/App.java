package upcasting;

public class App {

	public static void main(String[] args) {
		
		
		 //upcasted object 
		 Student s1 = new Admin(); 
		 s1.view(); 
		//here Student(left side)--->Compilation
		// Admin(right side)--->Execution 
		 //s1.edit();//CTE 
		 
	}
}
