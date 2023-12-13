package org.com;

public class PalindromeString {

	public static void main(String[] args) {
		String name = "madam";
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);

		}
		System.out.println(reverse);
		if (name.equals(reverse)) {
			System.out.println(name + " is a palindrome");
		} else {
			System.out.println(name + " is not palindrome");
		}

	}

}
