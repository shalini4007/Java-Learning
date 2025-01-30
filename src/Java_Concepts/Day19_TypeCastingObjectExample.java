package java_Concepts;


//A b=(C) d;
public class Day19_TypeCastingObjectExample {

	public static void main(String[] args) {
		
		//Example1
		Object ob= new String("Welcome");//Rule2 satisfied -->(StringBuffer) and s is of same type StringBuffer
		StringBuffer s=(StringBuffer) ob;//Rule1- Satisfied Object and StringBuffer have relationship  
		//Rule3-- Not satisfied--StringBuffer ob and String object ob is not same 
		
		//Example2
		
		String s1= new String("Welcome");
		//StringBuffer s2=(StringBuffer) s1;//Rule1- fails
		
		//Example3
		
		Object ob1= new String("Welcome");//Rule2 Failed -->(String) and s2 is of not of same type 
		//StringBuffer s2=(String) ob1;//Rule1- Satisfied Object and String have relationship  
		
		//Example4
	Object d=new String("Test");//Rule1- Satisfied Object and String have relationship 
	String e=(String) d;//Rule2 satisfied -->(String) and e is of same type StringBuffer
	//Rule3--> String d and e String is of same type
	
	}

}
