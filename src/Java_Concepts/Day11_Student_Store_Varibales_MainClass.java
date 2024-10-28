package Java_Concepts;

public class Day11_Student_Store_Varibales_MainClass {
	
	public static void main (String[] args)
	{
		Day11_Student_Varibales st= new Day11_Student_Varibales();
		//1) using object reference variables- just print
		
		/*
		 * st.sid=100;
		 *  st.sname="sga"; 
		 *  st.grade='A';
		 */
		
		//2) using method- store n print- without setting the data we cannot print anything 
		st.setStudentData(10, "test", 'B');
		st.printStudentData();
		
		//3) using constructor we can store the data in the variables
		
		
	}

}
