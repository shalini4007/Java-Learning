package Java_Concepts;

import java.util.Arrays;

public class Day7_Array_Sorting {

	public static void main(String[] args) {
		// 
		
		int a[]= {100, 600, 200, 400, 500};
		System.out.println("Before sorting....");

		/*
		 * for(int value:a) { System.out.println(value); }
		 */
		
		System.out.println(Arrays.toString(a));// to print the array values collectively
		Arrays.sort(a);//to sort array elements
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(a));
		
		/// Sorting Characters
		char b[]= {'D', 'C', 'B', 'A'};
		System.out.println("Before sorting...." + Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("After sorting...." + Arrays.toString(b));
		
		////// Sorting String
		
		String c[]= {"scott", "marry", "john", "David"};
		System.out.println("Before sorting...." + Arrays.toString(c)); 
		
		Arrays.sort(c); 
		
		System.out.println("After sorting...." + Arrays.toString(c));
		
		
		
	}

}
