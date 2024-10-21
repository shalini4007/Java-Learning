package Java_Concepts;

public class Day9_String_Programs {

	public static void main(String[] args) {
		
		////Example Reverse a String////
		///Approach1- Using charAt() and length() menthods
		String s="Selenium";
		String rev= "";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reversed String is: " + rev);
		
		
		////Approach2- By converting string to char array type
		
		String s1="Selenium";
		String rev1="";
		char a[]=s.toCharArray();
		for(int k=a.length-1; k>=0; k--)
		{
			rev1=rev1+a[k];
		}
		System.out.println("Reversed String is: " + rev1);

		
		///// Approach3- Using string buffer class
		
		StringBuffer p= new StringBuffer("Welcome");
		System.out.println(p);
		System.out.println(p.reverse());
		
	///// Approach4- Using string builder class
		StringBuilder q= new StringBuilder("Welcome");
		System.out.println(q);
		System.out.println(q.reverse());
		
		
	}

}
