package Java_Concepts;

//Inheritance-Acquiring variable/properties and behavior/methods from one class to another class
//Re-usability/avoid duplicates/
//Example- Banking app- Personal loans- 10 classes and Home Loan- 10 classes
// Since it's loan - there would be some common classes - hence inheritance comes to picture
// background verification/address proof/ - reduces number of classes
//Types- 1) Single- one child and one parent class
//2) Multi level- parent class to child class1- child class2
//3) Hierarchy- One parent class- many child class 
//4) multiple- multiple parents having one child class-Class do not support multiple inheritance
//so interface comes into picture- It's support multiple inheritance
// extends keywords can invoke only one class
//multiple-Ambiguity causes if tried extending

class A
{
	int a=100;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b=200;
	void show()
	{
		System.out.println(b);
		
		
	}
}


public class Day14_Inheritance_Single// only main class can have public access modifiers 
{
	public static void main(String[] args) {
		B obj= new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.display();
		obj.show();
		
	
}
}
