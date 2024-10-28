package Java_Concepts;

public class Day12_Polymorphism_Overloading_MainClass {

	public static void main(String[] args) {
		Day12_Polymorphism_Overloading adder= new Day12_Polymorphism_Overloading();
		
adder.sum();//Method1 called
adder.sum(1, 2);//Method2 called
adder.sum(4, 9.88);//Method3 called
adder.sum(1.2, 5);//Method4 called
adder.sum(1, 2, 3);//Method5 called
//adder.sum(1.6, 2, 3);//Method unavailable in Day12_Polymorphism_Overloading

	}

}
