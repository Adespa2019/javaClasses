package com.class14;

public class Task1 {
public static void main(String[] args) {
	String str="Hello, how are you doing?";
	System.out.println(str.replaceAll(" ",""));
	///
	String str1="123hi456&^%HI987";
	System.out.println(str1.matches("a-zA-Z0-9.*"));
	///
	String a= "Is it saturday? Is it raining? Do we have a Java Class today?";
	String [] array =a.split(" ");
	System.out.println(array.length);
}}
