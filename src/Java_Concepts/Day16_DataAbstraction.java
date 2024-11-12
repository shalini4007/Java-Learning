package Java_Concepts;

//Abstraction is a process of hiding the implementation and showing functionality to the user
//Abstract class

//Interface
//-->1) An interface is a blueprint of class
//-->2) An interface contains only final and static variables
//-->3) Interface contains abstract methods.(Allowed default & static methods from java8 onwards)
//-->4) An abstract methods contains only signature not body.
//-->5) Methods in Interface are public
//-->6) Supports multiple Inheritance
//-->7) We can define interface with interface keyword
//-->8) A class extends another class, an interface extends another interface, but a class implements an interface
//-->9) We can create object reference for interface but we cannot instantiate interface
//-->10) We cannot create og object of an Interface but we can create object of class which implements an interface
//-->11) Example-Design of an software having only abstract methods

interface shape
{
	int length=20;//final and static 
	int width=10;//final and static 
	
	void circle();//abstract method
	
	default void square()
	{
		System.out.println("this is square-default method");
	}
	
	static void rectangle()
	{
		System.out.println("this is static method-static method");
	}
	
}

public class Day16_DataAbstraction implements shape

{
	int x=100; int y=200;
	public void circle()
	{
		System.out.println("this is circle-abstract method");
	}
	
	void triangle()
	{
		System.out.println("this is triangle ");
	}

	public static void main(String[] args) 
	{
		
		//Scenario1
		Day16_DataAbstraction In =new Day16_DataAbstraction();
		In.circle();//abstract
		In.square();//default
		In.triangle();
		shape.rectangle();//static method can be directly accessed from Interface 
		System.out.println(In.x * In.y);
		//Scenario2
		shape sp=new Day16_DataAbstraction();
		sp.circle();//abstract
		sp.square();//default
		shape.rectangle();//static method can be directly accessed from Interface 
		//sp.triangle(); we cannot access since it's method of class
		
		System.out.println(shape.length * shape.width);//accessing static variables directly 
		//System.out.println(sp.x * sp.y);-->> we cannot access since it's variable of class 
	}

}
