package com.class14;

import java.util.Scanner;

public class InterviewQ1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int x=10;
	int y=20;
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println(x);
	System.out.println(y);
	/////
	String a="hello";
	String b="bye";
	System.out.println(a.replaceAll(a, b));
    System.out.println(b.replaceAll(b, a));
	}

}
