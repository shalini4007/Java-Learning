package Java_Concepts;

//Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
//Data types-Wrapper classes
//int-Integer
//float-Float
//double-Double
//char-Character
//boolean-Boolean
//short-Short

//Predefined classes- String, ArrayList

//String-->int  Integer.parseInt(String value)
//String-->double Double.parseDouble(String Value)
//String-->boolean Boolean.parseBoolean(String Value)
//String to character is not possible

//ArrayList arr= new ArrayList();
//ArrayList<Integer> arr1= new ArrayList<Integer>();--> Valid
//ArrayList<int> arr1= new ArrayList<int>();--> Not Valid


public class Day17_WrapperClasses

{
	String s="welcome";//cannot convert to Integer
	public static void main(String[] args) 
	{
		//String-->int  Integer.parseInt(String value)
		
	
		
		String s1="100";
		String s2="300";
		System.out.println(Integer.parseInt(s1)+ Integer.parseInt(s2));
		
		//String-->double Double.parseDouble(String Value)
		String s3="100.6";
		String s4="300.7";
		System.out.println(Double.parseDouble(s3)+ Double.parseDouble(s4));
		
		//String-->boolean Boolean.parseBoolean(String Value)
		String s5="true";
		System.out.println(Boolean.parseBoolean(s5));
		
		//String to character is not possible
		int a=10;
		double d=10.5;
		char c='A';
		boolean bool=true;
		
		System.out.println(String.valueOf(bool));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(a));
	}
	
}
