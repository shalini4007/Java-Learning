package java_Concepts;

public class Day9_String_Comparison {

	public static void main(String[] args) {
	///Scenario1
		
		String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		
		////Scenario2
		String s3= new String("Welcome");
		String s4= new String("Welcome");

		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);//false- compares object not the values
		System.out.println(s3.equals(s4));//true- compares object values
		
		///Scenario3
		String s5="abc";
		String s6= new String("abc");
		System.out.println(s5==s6);//false-compares object not the values
		System.out.println(s5.equals(s6));//true-compares object values
		
		////Scenario4
		
		String s7="abc";
		String s8= new String("abc");
		String s9=s8;
		System.out.println(s7==s8);//false-compare the objects
		System.out.println(s7.equals(s8));//true- compare objects values
		System.out.println(s8==s9);//true-object comparison since s9 is assigned to s8
		System.out.println(s7==s9);//false-compare the objects
		System.out.println(s7.equals(s9));//true- compare objects values
		
		
	}

}
