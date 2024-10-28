package Java_Concepts;

public class Day12_OverloadingMainMethod{
	
	//We can overload main method
	//JVM is responsible for executing main method

	void main(int x) {
		System.out.println(x);
	}
	
void main(String name) {
		System.out.println(name);
	}

void main(String name1, String name2) {
	System.out.println(name1+name2);
}
	
	public static void main(String[] args) //Main method
	{
		Day12_OverloadingMainMethod ov= new Day12_OverloadingMainMethod();
		ov.main(1);
		ov.main("test");
		ov.main("Shal", "hello");
		
	}
	
}
