package com.class15;

public class StringManipu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Syntax Technologies";
char letter=str.charAt(5);
System.out.println(letter);
System.out.println(str.charAt(str.length()-1));
// substring from string
//syntax
String substr1=str.substring(0,6);
System.out.println(substr1);
//Technologies
String substr2=str.substring(7);
System.out.println(substr2);

	}

}
