package java_Concepts;

import java.util.Arrays;

public class Day9_Immutable_Mutable {

	public static void main(String[] args) {
		//Immutability-Cannot change
		//Mutable-Can change

		
		int a[]= {10,60,20,50,70};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);//Mutable
		System.out.println(Arrays.toString(a));
		
		
		String s= new String("Welcome");
		System.out.println(s);
		String concatString=s.concat("to java");
		System.out.println(s);//Immutable- We cannot change
		System.out.println(concatString);
	}

}
