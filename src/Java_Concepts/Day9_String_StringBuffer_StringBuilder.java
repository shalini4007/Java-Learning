package Java_Concepts;

public class Day9_String_StringBuffer_StringBuilder {

	public static void main(String[] args) {
		
		//String-Immutable-Cannot change Original value of a String
		String s= new String("Welcome");
		System.out.println(s);
		s.concat("to java");
		System.out.println(s);//Immutable-Cannot change value of s
		
		//String Buffer-Mutable-Can change Original value of a String
		StringBuffer p= new StringBuffer("Welcome");
		System.out.println(p);
		p.append(" to java");
		System.out.println(p);
		
		//String Builder-Mutable-Can change Original value of a String
				StringBuilder q= new StringBuilder("Welcome");
				System.out.println(q);
				q.append(" to java");
				System.out.println(q);

	}

}
