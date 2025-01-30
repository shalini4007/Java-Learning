package java_Concepts;
//try-->Opening the connection/file
//catch--> handle exception
//finally--> closing
//Finally blocks will always execute whether exceptions occurs or not
//All the statements in finally always executes
//Finally is an optional block
//case1-Exception occurred--> Catch block handled--> finally block will execute
//case2-Exception occurred--> Catch block NOT handled--> finally block will execute
//case1-Exception does NOT occurred--> Catch block ignored--> finally block will execute

public class Day18_FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		//Case1
		try {
			String s=null;
			System.out.println(s.length());
			
		}
		catch(NullPointerException e){
			System.out.println("Handle Exception");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Finally Block is executed");
		}
		
		
		/*
		 * //Case2 try { String s1=null; System.out.println(s1.length());
		 * 
		 * }
		 * 
		 * finally { System.out.println("Finally Block is executed"); }
		 * 
		 */
				
		//Case3
				try {
					String s2="Test";
					System.out.println(s2.length());
					
				}
				catch(NullPointerException e){
					System.out.println("Handle Exception");
					System.out.println(e.getMessage());
				}
				finally
				{
					System.out.println("Finally Block is executed");
				}
		System.out.println("Program Ends");
	

	}

}
