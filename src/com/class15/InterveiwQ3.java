package com.class15;

public class InterveiwQ3 {
	public static void main(String[] args) {
		//Find out how many alpha characters present in a string?
		String str="HeLLo&^%&^8752653";
		str=str.replaceAll("[^a-nA-N]","");
		System.out.println(str.length());
	}
}
