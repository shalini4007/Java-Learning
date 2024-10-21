package Java_Concepts;

public class Day10_OOPS_Employee_MainClass {


	public static void main(String[] args) {
		//Object oriented programming concepts- Class/Object/polymorphism/Inheritance/Data abstraction	
		//Class is collection of attributes and behavior-->> Virtual/Logical entity and collection of variables & methods & not occupy space in memory
		//Objects- Physical entity/ Instance of a class/occupy space/can create multiple objects in a class
		//Example1- Animal is class -->>Dog, cat, deer are objects having their own attributes/behavior
		//Example2-Employee is class-->> Puru, Teju and Shalu are objects having their own attributes/behavior
		//Objects should be created in main method
		//Only one should contain main class and rest all should be plain class 
		Day10_OOPS_Employee emp1= new Day10_OOPS_Employee();
		emp1.empId=101;
		emp1.eName="Test";
		emp1.job="TE";
		emp1.sal=1000000;
		
		emp1.display();
		
		Day10_OOPS_Employee emp2= new Day10_OOPS_Employee();
		emp2.empId=100;
		emp2.eName="Sha";
		emp2.job="Manager";
		emp2.sal=2000000;
		
		emp2.display();
		
		
	}
}
