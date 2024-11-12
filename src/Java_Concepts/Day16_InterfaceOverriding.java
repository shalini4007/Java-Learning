package Java_Concepts;

public class Day16_InterfaceOverriding  implements Day16_Interface_I1, Day16_Interface_I2{

	@Override
	public void m2() {
		System.out.println(x);
		
	}

	@Override
	public void m1() {
		System.out.println(y);
		
	}
	
public static void main(String[] args)
{
	Day16_InterfaceOverriding ob= new Day16_InterfaceOverriding();
	ob.m1();
	ob.m2();
}
}

