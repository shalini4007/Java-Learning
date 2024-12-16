package Java_Concepts_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// A class implementing List Interface
//Both Heterogeneous(different) data is allowed
//Insertion order is not preserved(Indexing)
//Duplicate elements not allowed
//Multiple nulls not allowed(Only single null allowed)

public class Day20_HashSet {

	public static void main(String[] args) {
		
		//HashSet<String/Int/Object> myset= new HashSet<String/Int/Object>();
		
		Set set= new HashSet();//--> Can also be declared 
		HashSet myset= new HashSet();
		myset.add(100);
		myset.add(100.5);
		myset.add(true);
		myset.add("test");
		myset.add('A');
		myset.add(null);
		myset.add(false); 
		
		//Printing HasSet
		System.out.println(myset);//[null, A, 100, test, false, 100.5, true]
		
		//Removing element
		myset.remove(100.5);
		System.out.println("After removing 100.5 " +myset);
		
		//Inserting element is not possible in hashing
		
		//Accessing specific elements- Not possible
		
		//Converting HashSet into ArrayList
		ArrayList Al= new ArrayList(myset);
		System.out.println(Al);
		System.out.println(Al.get(2));
		
		//Retrieving all elements
		
		
		//for each loop
		for(Object x: myset)
		{
			System.out.println(x);
		}
		
		//Using Iterator
		
		Iterator<Object> it= myset.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		
		//Removing all elements from HashSet
		myset.clear();
		System.out.println("Is my HashSet empty: " + myset.isEmpty() );
	}

}
