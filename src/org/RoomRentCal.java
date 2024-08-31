package org;

import java.util.Scanner;

public class RoomRentCal {

	public static void main(String[] args) {

		int days, month;
		float rent;
		double sum;
		Scanner s = new Scanner(System.in);
		//month detail is stored in variable month of integer type
		System.out.print("The number of month : ");
		month = s.nextInt();
		//per day rent is stored in variable rent of float type
		System.out.print("Room rent per day in hotel : ");
		rent = s.nextFloat();
		//per day is stored in variable days of integer type
		System.out.print("Number of days stayed in hotel : ");
		days = s.nextInt();
		//Switch condition based statement is used
		//based on the month switch case will be executed
		switch (month) {
		case 1:
			//Using String.format() Method for getting 2 decimal point 
			System.out.println(String.format("%.2f", rent * days));
			break;
		case 2:
			System.out.println(String.format("%.2f", rent * days));
			break;
		case 3:
			System.out.println(String.format("%.2f", rent * days));
			break;
		case 4:
			//percentage calculation is done for 20% high during peak season
			sum = (rent * days) * 0.2;
			System.out.println(String.format("%.2f", rent * days + sum));
			break;
		case 5:
			//percentage calculation is done for 20% high during peak season
			sum = (rent * days) * 0.2;
			System.out.println(String.format("%.2f", rent * days + sum));
			break;
		case 6:
			//percentage calculation is done for 20% high during peak season
			sum = (rent * days) * 0.2;
			System.out.println(String.format("%.2f", rent * days + sum));
			break;
		case 7:
			System.out.println(String.format("%.2f", rent * days));
			break;
		case 8:
			System.out.println(String.format("%.2f", rent * days));
			break;
		case 9:
			System.out.println(String.format("%.2f", rent * days));
			break;
		case 10:
			System.out.println(String.format("%.2f", rent * days));
			break;
		case 11:
			//percentage calculation is done for 20% high during peak season
			sum = (rent * days) * 0.2;
			System.out.println(String.format("%.2f", rent * days + sum));
			break;
		case 12:
			//percentage calculation is done for 20% high during peak season
			sum = (rent * days) * 0.2;
			System.out.println(String.format("%.2f", rent * days + sum));
			break;
		}
	}
}
