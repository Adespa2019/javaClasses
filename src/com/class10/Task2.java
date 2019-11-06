package com.class10;

public class Task2 {
	public static void main(String[] args) {
		String [] capital= {"Pakistan","America","Thailand","England"};
		for (int i=0; i<capital.length; i++) {
			if(capital[i].equals("Pakistan")) {
				System.out.println("The capital of Pakistan is Islamabad");
			
			}else if(capital[i].equals("America")) {System.out.println("The capital of America is Washinton DC");}
			else if(capital[i].equals("Thailand")) {System.out.println("The capital of Thailand is Bankok");}
		else if(capital[i].equals("England")) {System.out.println("The capital of England is London");}
	}}

}
