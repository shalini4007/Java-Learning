package Java_Concepts;

//super keyword is used to get the value of variable/method of parent class when created object of child class
//super keyword is used to invoke the immediate parent class variable
//super keyword is used to invoke the immediate parent class method


	public class Day15_super_Animal
	{
		String color="White";
		
		void Eat() {
			System.out.println("Dog is eating");
		}
	}
	
	
	
	class Dog extends Day15_super_Animal{
	String color="black";
	void displayColor() {
		System.out.println(super.color);
	}
	
	void Eat() {
		super.Eat();
	}
	}


