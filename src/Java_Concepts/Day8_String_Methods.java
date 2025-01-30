package java_Concepts;

import java.util.Arrays;

public class Day8_String_Methods {

	public static void main(String[] args) {
		
		
		String s= new String("Welcome");// String s= "Welcome";
		//length()
		System.out.println(s.length());// Returns length of a string
		System.out.println("Welcome".length());// Returns length of a string

		//concat()
		String s1= "welcome";
		String s2= " test ";
		String s3="Java Automation";
		System.out.println(s1.concat(s2).concat(s3));//Joins s1, s2 and s3
		System.out.println(s1+s2+s3);
		System.out.println("Welcome".concat(" testing ").concat(" Java "));//Joining direct values
		
		//trim()
		String a="   Welcome   ";
		System.out.println("Before Trimming " + a.length());//before trim
		System.out.println("After Trimming " + a.trim().length());//after trim
		
		//charAt()
		System.out.println(a.charAt(6));//character value at 0 index
		
		//contains()- returns true or false
		System.out.println(s1.contains("tes"));//sequence should match else it will throw false
		System.out.println(s2.contains("tes"));
		
		//equals()--> Case sensitive, equalsIgnoreCase()- Case insensitive  ---> Used for comparing Strings
		
		String b1="Welcome";
		String b2="welcome";
		
		System.out.println(b1==b2);// case sensitive
		System.out.println(b1.equals(b2));// Case sensitive
		System.out.println(b1.equalsIgnoreCase(b2));// case in sensitive
		
		//replace()--> Replaces single characters or multiple characters in a string
		
		String c= "Welcome to selenium java python c# selenium";
		System.out.println(c);
		System.out.println(c.replace('e', 'x'));// replaces e character in string c to x character
		System.out.println(c.replace("selenium", "PlayWright"));// Replaces selenium string to Playwright string
		
		//substring(starting index will be 0, ending index will be 1:how many characters you wanna replace)- extract main string from main string
		//0123456
		//Welcome 
		//1234567
		String d="Welcome";
		System.out.println(d.substring(0, 3));//Wel
		System.out.println(d.substring(3, 7));//come
		System.out.println(d.substring(1, 4));//elc
		System.out.println(d.substring(0, 1));//W
		System.out.println(d.charAt(0));//W
		
		
		///toUpperCase() and toLowerCase() 
		String e="Welcome";
		System.out.println(e.toUpperCase());
		System.out.println(e.toLowerCase());
		
		//split()-splits the String into multiple parts based on delimiter
		String f="abc123@gmail.com";// @ and . is the delimiter here in the string
		String g[]=f.split("@");
		System.out.println(g[0]);//abc123
		System.out.println(g[1]);//gmail.com
		
		///split examples
		
		//Split-Example1
		
		String i="abc,123@xyz";
		String arr[]=i.split(",");// abc 123@xyz
		System.out.println(Arrays.toString(arr));
		String arr1[]=arr[1].split("@");
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr[0]);//abc
		System.out.println(arr1[0]);//123
		System.out.println(arr1[1]);//xyz
		
		///Split-Example2
		String p="abc xyz";
		String ar[]=p.split(" ");
		System.out.println(Arrays.toString(ar));//[abc, xyz]
		
		///Few symbols cannot be used as delimiters--> // * % ^ & ( ) -
		
		//Split-Example3
		String name="John Kenedy";
		System.out.println(name.replace('J','j').contains("john"));//true
		System.out.println(name.toLowerCase().contains("john"));//true
		
		String amount= "$15,20,30";
		System.out.println(amount.replace("$","").replace(",", ""));
		
	}

}
