package Java_Concepts;

import java.util.Scanner;

public class Day18_HandleExceptions {

	public static void main(String[] args) {

		System.out.println("Program started");
		Scanner sc= new Scanner(System.in);
		
		  System.out.println("Enter a Number"); 
		  int num=sc.nextInt();
		  try {
		  System.out.println(100/num);
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println("Invalid data");
		  }
		  System.out.println("Program Ended");
	}

}
