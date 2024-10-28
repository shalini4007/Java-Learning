package Java_Concepts;

public class Day12_Polymorphism_Overloading {

	int a=10; int b=20;
	
	    // One things can have many forms- can be achieved by method overloading
	   //Shapes-->> Circle, square, triangle 
      //Method overloading--> same method name--> Different arguments/ data types--> order of parameters should be different
	 // Why overloading
		
	void sum() //Method1
	{
		System.out.println(a+b);
	}
	void sum(int x, int y) //Method2
	{
		System.out.println(x+y);
	}
	void sum(int x, double y) //Method3
	{
		System.out.println(x+y);
	}
	
	void sum(double x, int y) //Method4
	{
		System.out.println(x+y);
	}
	
	void sum(int x, int y, int z) //Method5
	{
		System.out.println(x+y);
	}
}
