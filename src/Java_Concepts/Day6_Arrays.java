package Java_Concepts;

public class Day6_Arrays {

	public static void main(String[] args) {
		// Array is collection of elements of same data Type(Homogeneous data), stores multiple values in a single variable
		//not required to store 100 values in a 100 variables
		//indexes always start from zero
		//types of array 1) single dimensional 2) two/multi-dimensional
		//-> declare an array->add values to an array-> find size of an array->read single value from an array-> read multiple values from array
		
		///////single dimensional Array//////
		
		///Approach1- declaring and assigning
		int a[]= new int[5];//single dimensional- rows
		 a[0]= 100;
		 a[1]= 200;
		 a[2]= 300;
		 a[3]= 400;
		 a[4]= 500;
		
		////Approach2- 
		 
		 int b[]= {100, 200, 300, 400, 500};
		 
		System.out.println("Length of an array:" +a.length);//length of an array
		System.out.println(a[4]);// read particular array index value- 500
		
		///Reading all the values from array using for loop////
		
		for(int i=0; i<a.length-1; i++) {// OR i<=4; i<5; i<=a.length-1; i<a.length ( -1 is required because it gives array proper array length
			System.out.println(a[i]);
			
		}
		
		///Reading all the values from array using enhanced for loop////
		for(int x:a) {
			System.out.println(x);//exits when iterated over all the values
		}
		

		///////Multi-two dimensional Array//////
		//-> declare an array->add values to an array-> find size of an array->read single value from an array-> read multiple values from array

		
		///Approach1///
		
		int k [][]= new int[3][2];// [rows-3] [columns-2]
		
		k[0][0]=100;
		k[0][1]=200;
		
		k[1][0]=300;
		k[1][1]=400;
		
		k[2][0]=500;
		k[2][1]=600;
		
		///Approach2///
		
		int d[][]= { {100,200},
				     {300,400},
				     {500,600} };
		
		System.out.println("Length of rows:" +d.length);
		System.out.println("Length of columns:" + d[0].length);
		System.out.println(d[2][0]);//read single value from an array
		
		/// Read all values from array using normal for loop///
		for(int r=0;r<=2;r++) {
			for(int c=0; c<=1; c++) {
				System.out.print(d[r][c]+ "   ");
			}
			System.out.println();
		}
		
		for(int r=0;r<=d.length-1;r++) {
			for(int c=0; c<=d[r].length-1;c++) {
				System.out.print(d[r][c]+ "   ");
			}
			System.out.println();
		}
		
		////Enhanced for loop
		
		for(int arr[]:d)// capture first row values 100 200
		{
			for(int x:arr)//storing array values for x and come out once all the values of first row is done
			{
				System.out.print(x+"   ");
			}
			System.out.println();
		}
		
		////store different type of data in arrays
		
		Object w[]= {100, 10.5, 'A', "Testing", true};//Objects allows to store all kinds of data types values
		
		/// Retrieval of Objects values from for each loop
		
		for (Object x:w)
		{
			System.out.println(x);
		}
		
		/// Retrieval of Objects values from normal for loop
		
		for(int i=0; i<w.length-1;i++) {
			System.out.println(w[i]);
		}
	}

}
