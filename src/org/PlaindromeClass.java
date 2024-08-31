package org;
import java.util.Scanner;
public class PlaindromeClass {
	public static void main(String[] args) {
		//String rev is initialized with Null value
		String org, rev = "";
		//Scanner obj is used for getting value from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		org = scanner.nextLine();
		//length of string is calculated
		int len = org.length();
		//for loop is used for reversing the string
		for (int i = len - 1; i >= 0; i--) {
			//charAt() method is used for getting the string by index 
			rev = rev + org.charAt(i);
		}
		//equals() method is used for checking the string
		if (org.equals(rev))
			System.out.println("Enter string is a Plaindrome number");
		else
			System.out.println("Enter string is a not Plaindrome number");
	}
}
