package com.class4;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		
	
	
		
		System.out.println("please enter city");
		String cityName=scan.nextLine();
		System.out.println("Please enter temperature");
		int temp=scan.nextInt();
		
		int convertedTemp=(temp-32)*5/9;
		System.out.println("The temperature in city "+cityName+" is "+convertedTemp);
		
		
		
			   
			    System.out.println("Enter First Name ");
			    String first=scan.nextLine();
			    System.out.println("Enter Surname");
			    String sur=scan.nextLine();
			    System.out.println(first+" "+sur);
		
		
	}
	

}
