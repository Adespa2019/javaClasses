package com.class4;

public class Recap {
	public static void main(String[] args) {
		int num=23;
		num=90;
		num-=200;
		num-=110;
		num+=220;
		if(num>0) {
			System.out.println(num+" is a positive number");}
			else if(num==0) {
				System.out.println("Value of num is "+num);
			}
			
		else {System.out.println(num+" is negative number");}
		
		//even and odd(7'8)
		int i=134;
		if(i%2==0) {
			System.out.println(i+"is an even number.");
		
		}else {System.out.println(i+"is an odd number.");}
		if(i%2!=0) {System.out.println(i+"is even number");}
		else {System.out.println(i+"is odd number");}
	}

}
