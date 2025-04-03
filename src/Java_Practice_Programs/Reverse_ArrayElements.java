package java_Practice_Programs;

import java.util.ArrayList;

public class Reverse_ArrayElements {

	public static void main(String[] args) {
		 ArrayList<String> arr= new ArrayList<String>();
		arr.add("test");
		arr.add("orange");
		arr.add("app");
		arr.add("grapes");
	
		System.out.println(arr);
		System.out.println(arr.size());
		for(int i=arr.size()-1; i>=0; i--)
		{
			System.out.println(arr.get(i));
		}
		
	}

}
