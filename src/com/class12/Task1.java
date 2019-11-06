package com.class12;

public class Task1 {
public static void main(String[] args) {
	String sen1="It is sunny outside";
	String sen2="It was raining this Morning";
	//1 method
	int length=sen1.length();
	System.out.println(length);
	//2 method
	boolean value=sen1.contentEquals(sen2);
	System.out.println(value);
	//3 method
	sen1=sen1.toUpperCase();
	System.out.println(sen1);
	sen2=sen2.toLowerCase();
	System.out.println(sen2);
	sen1.equalsIgnoreCase(sen2);
	System.out.println(sen1);
}
}
