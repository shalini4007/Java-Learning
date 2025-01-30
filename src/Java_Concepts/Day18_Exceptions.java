package java_Concepts;

import java.util.Scanner;

//Exception is an event which will pause program execution
//Errors-->Syntax and logical-
//Exception Types
//Checked exceptions- identified by java compiler Ex->Interrupted/File Not Found/IO Exception etc..
//Checked exceptions-->Handled by two ways--> try catch-statement level and throws declaration-method level
//Un-checked exceptions- Not identified by java compiler Ex-> Arithmetic exception/Array out of bound/Null pointer etc..
//Un-checked exceptions-->>Handled --> try catch-statement level

public class Day18_Exceptions {

	public static void main(String[] args) {
		
	
		System.out.println("Program started");
		Scanner sc= new Scanner(System.in);
		
		//Example1-Arithmetic Exception
		
		/*
		 * System.out.println("Enter a Number"); int num=sc.nextInt();
		 * System.out.println(100/num);
		 */
		 		
		//Example2- ArrayIndexOutOfBoundsException
		/*
		 * int a[]=new int[5]; System.out.println("Enter position(0-4):"); int
		 * pos=sc.nextInt(); System.out.println("Enter value: "); int
		 * value=sc.nextInt(); a[pos]=value;
		 */
		
		//Example3-NumberFormatException
		
		/*
		 * String s="Welcome"; 
		 * int num1=Integer.parseInt(s); 
		 * System.out.println(num1);
		 */
		
		//Example4- NullPointerException
		
		String a=null;
		System.out.println(a.length());	//NullPointerException
		
		
		System.out.println("Program Ended");

	}

}
