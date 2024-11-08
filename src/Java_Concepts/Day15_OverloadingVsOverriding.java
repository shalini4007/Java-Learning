package Java_Concepts;
///Overriding
//1) Possible only in multiple classes- achived by inheritance
//2) We should not change args/signature/declaration but body/implementation should be changed
//3) methods names are same
//4) Belongs to Inheritance


//Overloading
//1) Possible in single and multiple classes
//2) We should change args/signature/declaration
//3) methods names are same
//4) polymorphism

	
	class ABC
	{
		void M1(int a)
		{
			System.out.println(a);
		}
		
		void M2(int b)
		{
			System.out.println(b);
		}
	}
	
	class XYZ extends ABC
	{
		void M1(int a)//overridden
		{
			System.out.println(a*a);
		}
		
		void M2(int b)//overridden
		{
			System.out.println(b*b);
		}
		
		void M2(int a, int b)//overloading in inheritance can be achieved in single class and multiple class
		{
			System.out.println(a+b);
		}
	}
	
	
	public class Day15_OverloadingVsOverriding {
		
		
	public static void main(String[] args) {
		
		XYZ xyz= new XYZ();
		xyz.M1(100);//Overridden method is being executed
		xyz.M2(200);
		xyz.M2(100, 244);

	}

}
