package Java_Concepts;

public class Day11_ConstructorDemo {

	
	int x, y;
	Day11_ConstructorDemo()//default constructor
	
	{
		x=100;
		y=200;
	}
	
Day11_ConstructorDemo(int a , int b)//Parameterized constructor
	
	{
		x=a;
		y=b;
	}

void sum() {
	System.out.println(x+y);
}
	public static void main(String[] args) {
		Day11_ConstructorDemo cn= new Day11_ConstructorDemo();//invoke default constructor
		Day11_ConstructorDemo cn1= new Day11_ConstructorDemo(100, 200);//invoke Parameterized constructor

		cn.sum();
		cn1.sum();
	}

}
