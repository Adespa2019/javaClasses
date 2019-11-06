package com.class8;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
				
			}System.out.println(i);
		}System.out.println("I am outside of the loop");
		System.out.println(">>>>>>>>>>>>>");
		Scanner scan=new Scanner(System.in);
		String ask;
		for(int i=1; i<=4; i++) {
			System.out.println("Apply for a credit card");
			ask=scan.nextLine();
			if(ask.equals("yes")) { break;}
			
		}
		
	}
	

}
