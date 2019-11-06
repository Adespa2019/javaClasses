package com.class13;

public class RegularExpressions {
public static void main(String args) {
	String str="1213he234l3198lo76";
	System.out.println(str.replaceAll("[0-9]",""));
	System.out.println(str.replaceAll("[a-zA-Z]",""));
}
}
