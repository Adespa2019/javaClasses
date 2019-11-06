package com.class6;

import java.util.Scanner;

public class SwitchAndScanner {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your gender: F or M");
		char gender=scan.next().charAt(0);
		String userGender;
		switch(gender) {
		
		case 'F':
			userGender="female";
			break;
		case 'M':
			userGender="male";
			break;
			default:
			userGender="unknown";
		}
		System.out.println("Your gender is "+userGender);
		
	}

}
