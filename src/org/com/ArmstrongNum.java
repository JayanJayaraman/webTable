package org.com;

public class ArmstrongNum {

	public static void main(String[] args) {
		int num = 153,a,i=0,j=0;
		a=num;
		while(a>0)
		{
			i=a%10; //3/5/1
			j=(j)+(i*i*i); //27/152/153
			a=a/10;//15/1/0
		}
		if (num == j) {
			System.out.println(num + " is a armstrong number");

		} else {
			System.out.println(num + " is not a armstrong number");

		}

	}
}