package org.com;

import java.util.Arrays;

public class ArrayAscend {

	public static void main(String[] args) {
		int[] a= new int[] {8,1,9,2,5,3,7};
		System.out.println("Before sorting" +Arrays.toString(a));
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
			if(a[i]>a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("After sorting" +Arrays.toString(a));
		}}

	
