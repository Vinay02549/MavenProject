package inheritence;

public class Forest extends Dog{

public static void main(String[] args) {
	
	/* single inheritence
	 * one super class and one sub class.
	 */
	Dog d = new Dog();
	d.eat();
	d.barks();
	System.out.println("Single level inheritence");
}
	
}
