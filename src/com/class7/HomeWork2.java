package com.class7;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		/*
		 * you need to ask user to pay for coffee you need to keep asking user to pay
		 * for it until enter priced id equal =5 after user paid then say
		 * "Enjoy your coffee!"
		 */
		Scanner scan = new Scanner(System.in);
		int price ;

		do {
			System.out.println("Please pay for the coffee");
			 price= scan.nextInt();

			
		}while (price != 5);
		System.out.println("Enjoy your coffee!");

	}

}
