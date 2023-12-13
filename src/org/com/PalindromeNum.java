package org.com;

public class PalindromeNum {

	public static void main(String[] args) {
		int num = 121, a, i = 0, j = 0;
		a = num;
		while (a > 0) {
			i = a % 10; // 1/3/2/1
			j = (j * 10) + i;// 1/13/132/1321
			a = a / 10;// 123/12/1/0

		}
		if (num == j) {
			System.out.println(num + "is a Palindrome number");

		} else {
			System.out.println(num + "is not a Palindrome number");

		}

	}
}