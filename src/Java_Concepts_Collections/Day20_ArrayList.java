package Java_Concepts_Collections;

import java.util.ArrayList;
import java.util.Iterator;

//A class implementing List Interface
//Both Heterogeneous(different) and Homogeneous(same) data is allowed
//Insertion order is preserved(Indexing)
//Duplicate elements allowed
//Multiple nulls allowed
public class Day20_ArrayList {

	public static void main(String[] args) {
		
		//Declaration
		//ArrayList myList= new ArrayList();
		//List myList= new ArrayList();
		//ArrayList <string> myList= new ArrayList<String>();
		
		//Addition of data into ArrayList
		ArrayList myList= new ArrayList();
		myList.add(100);
		myList.add(100.5);
		myList.add(true);
		myList.add("test");
		myList.add('A');
		myList.add(null);
		myList.add(null);
		myList.add(false); 	
		
		//size of ArrayList
		int i=myList.size();
		System.out.println("Size of ArrayList "+i);
		
		//Printing ArrayList
		System.out.println("Data of ArrayList "+myList);
		
		//Remove from ArrayList
		myList.remove(5);
		System.out.println("After removing index 5 "+ myList);
		
		//Insert element into ArrayList
		myList.add(7,"java");
		System.out.println("After adding index 7 " + myList);
		
		//replacing exiting elements
		myList.set(7, "C++");
		System.out.println("After updating index 7 " + myList);
		
		//Retrieving specific index element
		System.out.println(myList.get(7));
		
		// Retrieving all the elements of array List using for loop and for each loop
		
		//Using for loop
		
		for (int j=0; j<myList.size();j++)
		{
			System.out.println(myList.get(j));
		}
		
		//using enhanced/ for each loop
		
		for(Object x:myList)
		{
			System.out.println(x);
		}
		
		//Iterator
		//Iterator <String/Integer/Object> it= myList.iterator(); <Wrapper is optional>
		
		Iterator it= myList.iterator();//It's not an object but interface
		while(it.hasNext())// goes to the next element and also heps to check whether any further element present or not
		{
			System.out.println(it.next());// to print the series of elements
		}

		//Checking arrayList is empty or not
		System.out.println("Is ArrayList empty "+ myList.isEmpty());
		
		//To remove below elements from ararylist myList
		
		ArrayList myList2= new ArrayList();
		myList2.add('A');
		myList2.add("C++");
		
		myList.removeAll(myList2);
		System.out.println("After removing above elements from myList " +myList);
		
		//Remove all elements from myList
		myList.clear();
		System.out.println("Is ArrayList empty "+ myList.isEmpty());
		
		
		
	}

}
