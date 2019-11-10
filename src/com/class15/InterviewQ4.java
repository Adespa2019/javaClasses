package com.class15;

public class InterviewQ4 {

	public static void main(String[] args) {
		//
		//Howtofindoutthepartofthestringfromastring?
		//Whatissubstring?Findnumber of words in string?
		String str="Today is very cold outside";
		String subString=str.substring(0,5);
		System.out.println(subString);
		
		//step three
		String[]words=str.split(" ");
		System.out.println(words.length);
	}

}
