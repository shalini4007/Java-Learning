package Java_Concepts;

public class Day11_OOPS_Methods_Main_Class {

	public static void main (String[] args)
	{
		
		Day11_OOPS_Methods M= new Day11_OOPS_Methods();
		M.M1();//1) No Parameters-->> No return value
		
		String s=M.M2();//2) No Parameters-->>  return value
		System.out.println(s);
		
		M.M3("John");
		
		
		String value=M.M4("Test");
		System.out.println(value);
	}
	
		

	

}
