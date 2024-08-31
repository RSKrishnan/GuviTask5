package org;

import java.util.Scanner;

public class SandglassPattern {
	public static void main(String[] args) {
		int i, j, k, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print: ");
		n = sc.nextInt();
		//prints the first half of the pattern
		for (i = 0; i <= n - 1; i++) 
		{
			//to have the spaces
			for (j = 0; j < i; j++) 
			{
				System.out.print(" ");
			}
			//star printing is done
			for (k = i; k <= n - 1; k++) 
			{
				System.out.print("*" + " ");
			}
			//for new line
			System.out.println("");
		}
		//Prints the second of the pattern
		for (i = n - 1; i >= 0; i--)
		{
			//to have the spaces in the pattern
			for (j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			//star printing is done
			for (k = i; k <= n - 1; k++)
			{
				System.out.print("*" + " ");
			}
			//for new line
			System.out.println("");
		}
	}
}