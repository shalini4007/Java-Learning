package Java_Concepts;


public class Day18_MultipleCatchBlocks {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		try {
			String s=null;
			System.out.println(s.length());
			
		}
		catch(NullPointerException e){
			System.out.println("Handle Exception");
			System.out.println(e.getMessage());
		}
		
		catch(ArithmeticException e){
			System.out.println("Handle Exception");
			System.out.println(e.getMessage());
		}
		
		catch(NumberFormatException e){
			System.out.println("Handle Exception");
			System.out.println(e.getMessage());
		}
		System.out.println("Program Ends");
	}

}
