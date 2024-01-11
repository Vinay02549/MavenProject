package inheritence;

public class Forest1 extends Cat {

	public static void main(String[] args) {
		
		/*  Multi level inheritance.
		 *  here two super classes and two sub classes...
		 */
		Cat c = new Cat();
		c.barks();
		c.eat();
		c.meaow();
		System.out.println("mutli level inheritence");
		
		
	}
	
}
