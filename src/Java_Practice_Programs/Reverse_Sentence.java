package java_Practice_Programs;

import java.util.Arrays;

public class Reverse_Sentence {

	public static void main(String[] args) {
		String sen = "This is Java Class";
		String rev_sen = "";
		for (int i = sen.length() - 1; i >= 0; i--) {
			rev_sen = rev_sen + sen.charAt(i);
		}
		System.out.println("Reversed Sentence is: " + rev_sen);
		
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
