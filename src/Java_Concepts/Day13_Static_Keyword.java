package Java_Concepts;

		//static keyword can be applied for variables and methods
		//Employee main class- emp1/emp2/emp3 are different objects of class employee
		// dept no of emp1/emp2/emp3 are same - so memory allocation is more and if we need to change/update it we will need to update in each object
		//Any common/duplicate data or method across multiple objects -- then only use static variables and methods
		//static methods can access static stuffs without object
		//we can call static methods and variables in non-static methods

public class Day13_Static_Keyword {
	
	static int a=10;//static variable
	int b=20;// non static variable
	
	static void M1() //static method
	{
		System.out.println("Static Method");
	}
	
	 void M2() //non static method
	 {
		System.out.println("Non Static Method");
	}
	 
	 void M() //non static method
	 {
		 System.out.println(a);
			M1();
			
			System.out.println(b);
			M2();
	 }

	public static void main(String[] args) {
		System.out.println(a);
		M1();
		
		Day13_Static_Keyword st= new Day13_Static_Keyword();
		st.M();
		st.M1();
		st.M2();
		System.out.println(st.b);
		
		/*
		 * System.out.println(b); M2();// Cannot call it directly since the method n variable is not static it can only be invoked by creating object
		 * 
		 */
	}

}