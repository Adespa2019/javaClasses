package com.class6;

import java.util.Scanner;

public class ScannerSwitch {
public static void main(String[] args) {
	String country, foodName;
	Scanner scan;
	scan=new Scanner(System.in);
	System.out.println("Please enter your country");
	country=scan.nextLine();
	
	switch (country) {
	
	case"Turkey":
		foodName="kebab";
		break;
	case"Ethiopia":
		foodName="Tibs";
	break;
	case"Pakistan":
		foodName="Biryani";
		break;
	case"Moroco":
		foodName="Tajin";
		break;
		default:
			foodName="Unknown";
			
		
	
	}System.out.println("My country is "+country+" our famous food is "+foodName);
}
}
