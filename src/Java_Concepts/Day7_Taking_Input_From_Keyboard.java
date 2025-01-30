package java_Concepts;

import java.util.Scanner;

public class Day7_Taking_Input_From_Keyboard {

	public static void main(String[] args) {
	//int num=200;  -----> hard coded value
		
		Scanner sc= new Scanner(System.in);
		
		
		  System.out.println("Enter the number from keyboard"); 
		  int num= sc.nextInt();
		  System.out.println("This the number entered from keyboard " + num);
		 
 System.out.println("Enter decimal Number");
 double num1= sc.nextDouble();
 System.out.println("Decimal number entered from keyboard is "+ num1);
 
 System.out.println("Enter a String");
 String a= sc.next();
 System.out.println("String entered from keyboard is "+ a);
	}

}
