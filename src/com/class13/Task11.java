package com.class13;

public class Task11 {

	public static void main(String[] args) {
		String str="123he456ll789o";
		String str1="12-22-1990";
		System.out.println(str.replaceAll("[0-9]",""));
		System.out.println(str.replaceAll("[a-zA-Z]",""));
		
		String str2="Hi%$#&^How*&^";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(str1.replace('-', '/'));

	}

}
