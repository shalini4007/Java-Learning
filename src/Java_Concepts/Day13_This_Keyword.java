package java_Concepts;

//int b;--> global variables but java does not allow it

public class Day13_This_Keyword {
	
	int x, y;// class/Instance variables
	 Day13_This_Keyword(int x, int y){
		this.x=x;// class variables and local variables are same hence we can use this keyword to represent class variables
		this.y=y;// Mainly used to differentiate class and local variables both in method and constructor
	}
	 
	 void display(int a, int b)
	 {
		System.out.println(x=a);
		System.out.println(y=b);
		
	 }
	public static void main (String[] args)
	{
	
	// Two types of variables-> 1) Class/Instance variables and 2) Local variables
		Day13_This_Keyword k=new Day13_This_Keyword(100, 200);
		k.display(300,400);
	}
}
