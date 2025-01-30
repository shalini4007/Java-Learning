package java_Practice_Programs;

public class Reverse_String_N_Palindrome {

	public static void main(String[] args) {
		String s = "MADAM";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println("Reversed String is " + rev);
		if (rev.equals(s)) {
			System.out.println("Given string is a Palindrome");
		} else {
			System.out.println("Given string is not Palindrome");
		}
	}

}
