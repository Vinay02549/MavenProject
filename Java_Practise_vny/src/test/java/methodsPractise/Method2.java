package methodsPractise;

public class Method2 {

	/* create a prgm to find area of square,
	 *  triangle by creating separate method for each of 
	 *  them and call them from main method..
	 * 
	 */
	
	public static void main(String[] args) {
		
		areaOfTri();
		areaOfSq();
		}
	
	
	public static void areaOfTri() {
		int breadth = 4, height = 5;
		float area_t = (0.5f)*breadth*height;
		System.out.println("Area of Triangle is : "+ area_t);
	}
	public static void areaOfSq() {
		int side = 4, area_s;
		area_s = side*side;
		System.out.println("Area of square is : "+ area_s);
	}
	
	
}
