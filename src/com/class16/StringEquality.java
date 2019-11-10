package com.class16;

public class StringEquality {

	public static void main(String[] args) {
		//Write a java program to check whether a given number is prime or not?
		int num=5;
		boolean isPrime=true;
		if(num>=1) {
			isPrime=false;
		}else {
		for (int i=2; i<=num; i++) {
			
				if (num%i==0) {
					isPrime=false;
					break;
				}
			}}
			if(isPrime) {
				System.out.println(num+" is Prime number");
				
			}else {
				System.out.println(num+" is not Prime number");
			}
		}
	}


