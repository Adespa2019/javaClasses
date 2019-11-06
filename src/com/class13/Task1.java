package com.class13;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.print("Enter your day: :");
	String day=scanner.nextLine();
	if(day.trim().toLowerCase().equals("saturday")) {
		System.out.println("Saturday is your Java class");
	}else if(day.equalsIgnoreCase("sunday")) {
		System.out.println("Sunday is your Git class");
	}else if(day.toUpperCase().equals("TUESDAY")) {
		System.out.println("Tuesday is your SDLC class");
	}else if(day.contentEquals("Thursday")) {
		System.out.println("Thursday is your Manual Testing class");
	}else  {
		System.err.println("Envalid Entry!! Please enter a valid class day");
	}
	scanner.close();
	
}
}
