package com.class4;

public class IfElseRecap {
	public static void main(String[] args) {
		/* class schedule
		 * if tuesday-->sdlc
		 * if wed-->java rewiew
		 * if thursday -->sdlc
		 * if saturday-->Java
		 * if sunday-->java
		 */
	int day=7;
	if(day==2) {
		System.out.println("SDLC Class");
	}
	else if(day==3) {System.out.println("Java review class");}
	else if (day==4) { System.out.println("SDLC CLass");}
	else if (day==6) {System.out.println("Java Class");}
	else if(day==7) {System.out.println("Java class");}
	else {System.out.println("there is no Class");}
	}

}
