package java_Concepts;

 class P
{
	String name="Test";
	void m1()
	{
		System.out.println("This is m1 of Parent class");
	}
}

 class child extends P
{
	int id=10;
	void m2()
	{
		System.out.println("This is m2 of child class");
	}
}

public class Day19_ObjectTypecasting {

	public static void main(String[] args) {
		child c=new child();
		System.out.println(c.name);//parent class variable
		c.m1();//parent class method
		
		System.out.println(c.id);//child class variable
		c.m2();//child class method
		
		P p=new child();//upcasting- Cannot access child class methods and variables
		System.out.println(p.name);//parent class variable
		p.m1();//parent class method
		
		/*
		 * System.out.println(p.id);//child class variable
		 *  p.m2(); //child class method 
		 */
		
		P p1=new P();
		child c1=(child) p1;//downcasting ClassCastException we get in run time
		
		System.out.println(c1.name);//parent class variable
		c.m1();//parent class method
		
		System.out.println(c1.id);//child class variable
		c1.m2();//child class method
	}

}
