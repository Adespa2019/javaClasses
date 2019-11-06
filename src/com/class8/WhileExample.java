package com.class8;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[]  args) {
	/*true or false
	 * rain keep asking
	 * stop rain go to park
	 * 
	 * 
	 */
	 
  Scanner scan;
  boolean isRain;
  scan=new Scanner(System.in);
  do {
	  System.out.println("Is it raining?");
	  isRain=scan.nextBoolean();} while(isRain);
  System.out.println("Go to the park");
  }
}
