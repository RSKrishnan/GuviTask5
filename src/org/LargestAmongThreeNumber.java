package org;

import java.util.Scanner;

public class LargestAmongThreeNumber {

	public static void main(String[] args) {

		int a,b,c;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		a=scanner.nextInt();
		System.out.print("Enter the second number : ");
		b=scanner.nextInt();
		System.out.print("Enter the third number : ");
		c=scanner.nextInt();
		//first number is compared with second and third with greater than operator
		if((a>b)&&(a>c))
			System.out.println("First number is the largest number");
		//Second number is compared with first and third with greater than operator
		else if((b>a)&&(b>c))
			System.out.println("Second number is the largest number");
		else
			System.out.println("Third number is the largest number");
	}

}
