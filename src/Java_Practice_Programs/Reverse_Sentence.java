package java_Practice_Programs;

import java.util.Arrays;

public class Reverse_Sentence {

	public static void main(String[] args) {
		
	String sen= " this is pen";
		String arr[]=sen.split(" ");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length; i++)
		{
			String temp=arr[i];// {This word}
			String r="";
			for(int j=temp.length()-1; j>=0; j--)
			{
				r=r+temp.charAt(j);
			}
			System.out.print(r+ " ");
		}
		
	}

}
