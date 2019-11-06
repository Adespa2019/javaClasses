package com.class5;

public class LogicalNot {
	public static void main(String[] args) {
		boolean isRain=false;
		if(!isRain) {System.out.println("take an umbrella");}
		else { System.out.println("Do not take umbrella");}
		
		int num1=10;
		int num2=11;
		if (num1==num2) {
			System.out.println("Numbers are equal");
		}else { System.out.println("Numbers are not equal");}
		if(!(num1==num2)) {System.out.println("NUmbers are not equal");}
		else { System.out.println("Numbers are equal");}
		
		String name="Mary";
		String name2="elsa";
		if(!name.equals("Mary")  || name2.equals("Anna")) {
			System.out.println("You are not my sistr");
		}
		else {System.out.println("You are my sister");}
	}

}
