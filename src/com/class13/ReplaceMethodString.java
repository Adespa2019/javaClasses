package com.class13;

public class ReplaceMethodString {

	public static void main(String[] args) {
		String str ="Hello dear Dan , how are you Dan, how you been?";
		System.out.println(str.replace('n','z'));
		System.out.println("##########");
		System.out.println(str.replace("dear","Respected"));
		System.out.println(str.replaceFirst("Dan","Ali"));
		

	}

}
