package constructors;

public class Car {

	// No argument constructor....

	String carname;
	int price;
	String color;
	int capacity;

	public Car() {
		carname = "KIA Carnival";
		price = 5500000;
		color = "White";
		capacity = 8;
	}

	public static void main(String[] args) {

		Car c = new Car();
		System.out.println(c.carname);
		System.out.println(c.price);
		System.out.println(c.color);
		System.out.println(c.capacity);

	}

}
