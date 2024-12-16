package Java_Practice_Programs;

import java.util.Scanner;

public class OperatorsScanner {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1= sc.nextInt();
		System.out.println("Enter the Second number");
		int num2= sc.nextInt();
		System.out.println("Addition =" + (num1+num2));
		System.out.println("Subtraction =" + (num1-num2));
		System.out.println("Multiplication =" + (num1*num2));
		System.out.println("Division =" + (num1/num2));
		System.out.println("Modulus =" + (num1%num2));
	}

}
