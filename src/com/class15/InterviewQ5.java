package com.class15;

public class InterviewQ5 {

	public static void main(String[] args) {
		//Write a java program to reverse String? Reverse a string word by word?
  String given="Welcome to the Java class";
   String reversed="";
   String []str=given.split("\\s");
   for(int j=str.length-1; j>=0; j--) {
	   reversed=reversed+str[j]+" ";
	   
   }
   System.out.println(reversed);
 //Write a java program to reverse String?
   String str1="Hello how are you?";
	for(int i=str1.length()-1; i>=0; i--) {
		System.out.print(str1.charAt(i));
	}
	}

}
