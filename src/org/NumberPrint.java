package org;

import java.util.Scanner;

public class NumberPrint {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//getting the input from user
		System.out.print("Enter a number : ");
		int n = scanner.nextInt();
		//Variable 's' is used for printing the numbers in pattern
		int s=1;
		//for loop is used for traversing
		//condition i<=n to run it
		for(int i=1;i<=n;i++)
		{
			//2 for loop used for traversing it number of times 
			//loop as a condition based to run till j<=i
			for(int j=1;j<=i;j++)
			{
				//value of s printed
				System.out.print(s);
				//variable is increased
				s++;
			}
			//to get a new line for the pattern
			System.out.println("\t");
		}
	}

}
