package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int year;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the Year: ");
		year = scan.nextInt();
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		System.out.println(year + " is a leap year: " + leapYear);
		
		
		//hi
	}

}
