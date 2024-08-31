package org;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		//Scanner class is used for getting values from user
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the mark : ");
		//values are assigned to variable 'mark'
		int mark = s.nextInt();
		//If else ladder is used for calculation of grade
		//If mark is equal to 100 grade is S
		if(mark==100) {
			System.out.println("S");
		}
		//If mark is in the range of 90 to 99 grade is A
		else if((mark<100)&&(mark>=90)) {
			System.out.println("A");
		}
		//If mark is in the range of 80 to 89 grade is B
		else if((mark<=89)&&(mark>=80)) {
			System.out.println("B");
		}
		//If mark is in the range of 70 to 79 grade is C
		else if((mark<=79)&&(mark>=70)) {
			System.out.println("C");
		}
		//If mark is in the range of 60 to 69 grade is D
		else if((mark<=69)&&(mark>=60)) {
			System.out.println("D");
		}
		//If mark is in the range of 50 to 59 grade is E
		else if((mark<=59)&&(mark>=50)) {
			System.out.println("E");
		}
		//If mark is less then 50 grade is F
		else if((mark<50)) {
			System.out.println("F");
		}
		//If mark is greater then 100 Invalid Input
		else
			System.out.println("Invalid Input");
		
	}

}
