package java_Concepts;

//Type casting-converting type of data
//types
//1) Upcasting/Widening --> Converting data value from smaller to larger--> Int---->long(Automatic process)
//2) Downcasting/Narrowing-->Converting data value from larger to smaller-->long-->Int

public class Day19_TypeCasting {

	public static void main(String[] args) {
		
		//Up casting-->Converting data value from smaller to larger
		int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		 	 	
		float floatvalue=10.5F;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		
		int i=100;
		double d=i;
		System.out.println(d);
		
		//down casting-->Converting data value from larger to smaller-always a problem since we might loose some data 
			
			long longvalue1=10000;
			int intvalue1=(int) longvalue1;
			System.out.println(intvalue1);
			
			double doublevalue1=125.5;
			float floatvalue1=(float)doublevalue1;
			System.out.println(floatvalue1);
			
			double d1=10.5;
			int i1=(int)d1;
			System.out.println(i1);//output-10

	}

}
