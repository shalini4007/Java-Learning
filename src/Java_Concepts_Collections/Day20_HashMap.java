package Java_Concepts_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

//A class implementing Map Interface
//Data is stored in the form of key and value pair
//Key is unique but can have duplicate values
//Insertion order is not preserved(Indexing)

public class Day20_HashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(100, "John");
		hm.put(101, "Scott");
		hm.put(102, "Mary");
		hm.put(103, "Scott");
		hm.put(102, "David");
		
		//Printing all
		System.out.println(hm);
		
		//Size of the Map
		System.out.println("Size of the Map "+ hm.size());
		
		//Removing one key-value pair
		hm.remove(103);
		System.out.println("After removing 103 "+ hm);
		
		//Get value of the key
		System.out.println(hm.get(100));
		
		//Get all the Keys from hashmap
		System.out.println(hm.keySet());
		
		//Get all the Values from hashmap
		System.out.println(hm.values());
		
		//Get all Keys and Values at a time
		System.out.println(hm.entrySet());
		
		//Reading data from HashMap
		
		//Using for each loop
		
		for(int k: hm.keySet())
		{
			System.out.println(k + "   " + hm.get(k));
		}
		
		//Using Iterator
		
		Iterator<Entry<Integer, String>>it= hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer, String> entry =it.next();
			System.out.println(entry.getKey() + "   " + entry.getValue());
			//System.out.println(it.next());
		}
		
		hm.clear();
		System.out.println(hm.isEmpty());
		
	}
}
