package arrays;

public class Arrays1 {
	public static void main(String[] args) {
/* ----------Arrays---------
 * An Array is collection of homogenous elements.(data)
 * whenever we want to use multiple or group of elements or data at same
 * time we go for arrays.
 *  syntax:   arraytype  arrayname[]=new arraytype[size];
 *            arraytype[] arrayname = new arraytype[size];
 *            arraytype []arrayname = new arraytype[size];
 * 
 * array store the elemets in index format, it starts from 0 1 2 3..
 * storing elements in an array by using index values.
 */
		
		int a[] = new int[3];
		  a[0]=10; 
		  a[1]=20;
		  a[2]=30;
		
	double []d = new double[3];
	     d[0]=0.123;
	     d[1]=0.654;
	     d[2]=1.252;
	    // d[3]=8.42; // array index out of bound exception-- 
	                // exception in thread "main"
	     			// java.lang.ArrayIndexOfBoundException:26 line....
	     
	//for printing of an array...
	     System.out.println(a[0]);
	     System.out.println(a[1]);
	     System.out.println(a[2]);
	     
	     
	     System.out.println(d[0]);
	     System.out.println(d[1]);
	     System.out.println(d[2]);

	     // print array elements using for loop
	     for(int i=0; i<a.length; i++) {
	    	 System.out.println("using for loop "+ a[i]);
	     }

		//    using for each loop or enhanced loop
	     /*  syntax: for(arraytype varname:arrayname){
	          System.out.println(varname);
	          }                             */
	      String s[]= {"java", "sql", "mongodb", "selenium"};
	     for(String data:s) {
	    	 System.out.println(data);
	     }
		
		
		
		
	}
}
