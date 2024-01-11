package arrays;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		/*
		 *  Taking input from user and declaring size 
		 *  and giving values and displayed output.
		 */
		
		Scanner s  = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an array: ");
		size = s.nextInt(); //firstly we should input size of an array give input..
		int a[]=new int[size]; // an array gets created of size =4
		// for accepting inputs
		for(int i=0; i<a.length; i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Array elements are......");
		
		//for retrieving values
		for(int j=0; j<a.length; j++) {
			System.out.println(a[j]);
		}
		
	}
	
	
}
