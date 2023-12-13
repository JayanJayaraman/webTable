package org.com;

public class TraingleRight {

	public static void main(String[] args) {
		int rows = 1;
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(rows);
				System.out.print("\t");
				rows++;
			}
			System.out.println("");
		}
	}

}
