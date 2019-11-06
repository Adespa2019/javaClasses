package com.class5;

public class LogicalOr {
	public static void main(String[] args) {
		int day=6;
		if(day==2 || day==4) {
		System.out.println("SDLC class");
	}else if (day==6 || day==7) {
		System.out.println("Java class");
	}else if(day==1 || day==5) {
		System.out.println("No class");}
	else if (day==3) {
		System.out.println("Review class");
	}else {System.out.println("not a valid class");}
	
	}

}
