package Java_Practice_Programs;

import java.util.Scanner;

public class Reverse_Number_Using_Operators {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int rev=0;
		while(num!=0)
		{
			rev=rev*10 + num%10; //0*10 + 1234%10=4
			num=num/10;
			
		}
		System.out.println("Reversed number is:");

	}

}
