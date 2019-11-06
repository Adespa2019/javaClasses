package com.class12;

public class StringManipulation {

	public static void main(String[] args) {
		// 1 way
		String name="Jhon";
		System.out.println(name);
		System.out.println("the length of name is ="+name.length());
		//2 way
		String name1= new String("Jhon");
		System.out.println(name1);
		/*
		 * This method returns the lenght of this string
		 * the length is equals to numbers
		 * od 16-bit Unicode characters in the string.
		 * 
		 */
		int name1Len=name.length();
		System.out.println(name1Len);
		// lower case
		String str1="Hello worlD";
		System.out.println("Before::"+str1);
		str1=str1.toLowerCase();
		System.out.println("After::"+str1);

		//.equals
		String str2="Hello worlD";
		boolean isEqual=str1.contentEquals(str2);
		System.out.println(isEqual);
		
		//.equalsIgnoreCase();
		System.out.println(str1.equalsIgnoreCase(str2));
		//Upper case
		String str3="Mohammad";
		System.out.println("Before::"+str3);
		str3=str3.toUpperCase();
		System.out.println("After::"+str3);
		
	}

}
