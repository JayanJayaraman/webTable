package org.com;

public class ReverseString {

	public static void main(String[] args) {
		String empName = "Jayan Prasad";
		
		String Rev ="";
		
		for(int i=empName.length()-1;i>=0;i--)
		{
		
			Rev = Rev+ empName.charAt(i);
			Rev=Rev.replaceAll(" ", "");
			
			
		}
			System.out.println(Rev);
	
	}}
