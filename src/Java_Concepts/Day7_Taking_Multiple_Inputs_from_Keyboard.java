package Java_Concepts;

import java.util.Scanner;

public class Day7_Taking_Multiple_Inputs_from_Keyboard {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		  System.out.println("Enter the first numbner from keyboard"); 
		  int num1= sc.nextInt();
		  System.out.println("First number entered from keyboard " + num1);

		  System.out.println("Enter the Second numbner from keyboard"); 
		  int num2= sc.nextInt();
		  System.out.println("Second number entered from keyboard " + num2);

		  System.out.println("Enter the Third numbner from keyboard"); 
		  int num3= sc.nextInt();
		  System.out.println("Third number entered from keyboard " + num3);
		  
		  System.out.println("Addition of three numbers " + (num1+num2+num3));
		  
		  System.out.println("Enter the boolean value from keyboard"); 
		 boolean boo= sc.nextBoolean();
		  System.out.println("Boolean entered from keyboard " + boo);

	}

}
