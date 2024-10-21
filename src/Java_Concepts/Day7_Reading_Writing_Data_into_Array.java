package Java_Concepts;

import java.util.Scanner;

public class Day7_Reading_Writing_Data_into_Array {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter a Value");
			a[i] =sc.nextInt();
		}
	}

}
