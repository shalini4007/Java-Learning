package java_Concepts;

//Inheritance-Acquiring variable/properties and behavior/methods from one class to another class
//Re-usability/avoid duplicates/
//Example- Banking app- Personal loans- 10 classes and Home Loan- 10 classes
// Since it's loan - there would be some common classes - hence inheritance comes to picture
// background verification/address proof/ - reduces number of classes
//Types- 1) Single- one child and one parent class
//2) Multi level- parent class to child class1- child class2
//3) Hierarchy- One parent class- many child class 
//4) multiple- multiple parents having one child class- Class do not support multiple inheritance
// so interface comes into picture- It's support multiple inheritance
//extends keywords can invoke only one class
//multiple-Ambiguity causes if tried extending



class Parent
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class child1 extends Parent
{
	int b;
	void show()
	{
		System.out.println(b);
		
		
	}
}

class child2 extends Parent
{
	int c;
	void print()
	{
		System.out.println(c);
		
		
	}
}

class child3 extends Parent
{
	int d;
	void sleep()
	{
		System.out.println(d);
		
		
	}
}


public class Day14_Inheritance_Hierarchical// only main class can have public access modifiers 
{
	public static void main(String[] args) {
		child1 c1= new child1();
		c1.a=100;
		c1.b=200;
		
		child2 c2= new child2();
		c2.a=100;
		c2.c=300;
		
		child3 c3= new child3();
		c3.a=100;
		c3.d=400;
		
		c1.display();
		c1.show();
		
		c2.display();
		c2.print();
		
		c3.display();
		c3.sleep();
		
	
}
}
