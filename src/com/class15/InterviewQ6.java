package com.class15;

public class InterviewQ6 {

	public static void main(String[] args) {
		//Write a Java Program to find whether a String is palindrome or not?
		//mom, dad, madam, kayak, racecar, bob,
		String original="kayak";
		String reversed="";
		for(int i=original.length()-1; i>=0; i--) {
			reversed=reversed+original.charAt(i);//""+k=k+a=ka+k
		}System.out.println(reversed);
		if(original.equals(reversed)) {
			System.out.println("string is palinadrome");
		}else {
			System.out.println("string is not palinadrome");
		}
	}

}
