package com.class4;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*nextInt();-> for numbers
		 * nextLine(); Strings
		 * nextDouble();-> double
		 */
	System.out.println("please put any number");
	int num=scan.nextInt();
	System.out.println("please print name");
	String name=scan.nextLine();
	
	System.out.println(num+" is "+name+" lucy number ");
		
		
		
	}

	
}
