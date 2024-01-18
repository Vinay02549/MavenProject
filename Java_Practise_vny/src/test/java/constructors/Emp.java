package constructors;

public class Emp {
	// Parameterized constructor...

	String name, desg;
	int id, sal;

	public Emp(String ename, String edesg, int eid, int esal) {
		name = ename;
		desg = edesg;
		id = eid;
		sal = esal;

	}
	
	//defining display()
public void Display(){
	System.out.println("Name : "+name);
	System.out.println("Designation : "+desg);
	System.out.println("Employee id : "+id);
	System.out.println("Employee salary per month is : "+sal);
	System.out.println("-----------------------------------------");
}
public static void main(String[] args) {
	
	Emp e1 = new Emp("John","QA", 1233,25000);
	e1.Display();
	Emp e2 = new Emp("Smith","QA", 1234,28000);
	e2.Display();
	Emp e3 = new Emp("Rocky","QA", 1235,35000);
	e3.Display();
	
}

}
