package Java_Concepts;

class Animals
{
	
}

class dogs extends Animals{
	
}

class cats extends Animals{
	
}
public class Day19_TypecastingObj {

	public static void main(String[] args) {
		
		//Rules-
		//1) Conversion is valid or not that is type of 'd' and 'c' must have some relationships(either parent to child or chil to parent)
		//2) Assignment is valid or not--> C must be either same or child of A
		//3) The underlying object type of 'd' must be either child of 'C' or same 
		Animals an= new dogs();//valid as per rule 1 
		cats ct=(cats) an;//valid as per rule 1
		
		
		dogs dg= new dogs();
		//cats ct1=(cats)dg;-->Invalid as per rule 1

		Animals an1=new dogs();
		cats ct2=(cats) an1;//valid as per rule 2
		
		Animals an2=new dogs();
		//cats ct3=(dogs) an2;-->Invalid as per rule 2
		
		Animals an3= new dogs();
		cats ct3=(cats) an3;//-->Invalid as per rule3--> Run time error
		
		Animals an4= new dogs();
		dogs dg2= (dogs) an4;// All the rules are satisfied
		

		
		
		
		
	}

}
