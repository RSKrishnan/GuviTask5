package org;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		//String variable org,rev is initialized with null value
		String org,rev="";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		 org = scanner.nextLine();
		 //length of string is calculated
		int len = org.length();
		//for loop is used to traversing the String
		for (int i=len-1;i>=0;i--)
		{
			//charAt() method is used for getting the position of string
			rev=rev+org.charAt(i);
		}
		System.out.println("Reveresed String is "+rev);
		
	}

}
