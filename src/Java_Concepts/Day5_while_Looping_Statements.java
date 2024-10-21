package Java_Concepts;

public class Day5_while_Looping_Statements {
//Also called Iterative statements
	//while loop--->  do while loop--->  for loop---> enhanced for loop or for each loop
	//single statements execute multiple times// reduce the code// avoids duplicates
	//Initialization(where to start)---> Conditions(how many times to execute)---> Increment/decrement
	
	
	public static void main(String[] args) {
		//// While loop////
		////while(condition){statements; increment/decrement}///syntax
		
		/*
		 * ///Example1- Print 1 to 10//// int i=1; while(i<=10) { System.out.println(i);
		 * i++; }
		 */
		/*
		 * //Example2-Print hello message 10 times///// int w=1; while(w<=10) {
		 * System.out.println("Hello"); w++; }
		 */
		/*
		 * //Example3- Print even number between 1 to 10//// int y=2; while(y<=10) {
		 * System.out.println(y); y=y+2; }
		 */
			
			/*
			 * int y1=1; while(y1<=10) { if(y1%2==0) { System.out.println(y1); } y++; }
			 * 
			 */

			/*
			 * ///Example 4- Print whether number is even or odd///
			 * 
			 * int a=1; while(a<=10) { if(a%2==0) { System.out.println(a + "even"); } else {
			 * System.out.println(a + "odd"); } a++; }
			 */
		
		///Example 5-Print 10 to 1////
		
		int b=10;
		while(b>0) {
			System.out.println(b);
			b--;
		}
		
		///Example 6 without condition-infinite loop//
		int u=1;
		while(true) { //Not sure about the number of iterations
			System.out.println("Hello");
			u++;
			if(u==10) {
				break;// Jumping statement and come out of the loop
			}
		}
	}

}
