package com.class13;

public class Task2 {
public static void main(String [] args) {
	String day= "sunday";
	if(day.contentEquals("Sunday")) {
	
		System.out.println(day);}
	else {System.out.println("yadnuS");}
	// for metthod
	for(int i=day.length()-1; i>=0; i--) {
		System.out.print(day.charAt(i));
	}
	System.out.println("*********");
	//task2
	String str="Hello";
	int middle=str.length()/2;
	if(!str.isEmpty()) {
		if(str.length()%2!=0 && str.length()>=3) {
			System.out.println(str.charAt(middle));
		}
	}
	
}
}
