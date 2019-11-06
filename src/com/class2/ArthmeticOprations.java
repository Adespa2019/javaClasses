package com.class2;

public class ArthmeticOprations {
	/*
	 * declare 2 variables and initialize them
	 * perform addition, subtraction, multiplication and division
	 * 
	 */
	public static void main(String[] args) {
		int num1, num2;
		
		num1=30;
	    num2=20;
	    
	    System.out.println(num1+num2);
	    System.out.println(num1-num2);
	    System.out.println(num1*num2);
	    System.out.println(num1/num2);
	    
	    //how can we print value of num1 and num2 together
	    
	    System.out.println(num1+","+num2);
	    
	    int sum=num1+num2;
	    int sub=num1-num2;
	    int mult=num1*num2;
	    int div=num1/num2;
	    
	    System.out.println(sum);
	    System.out.println(sub);
	    System.out.println(mult);
	    System.out.println(div);
	    //the addition of 2 numbers is_
	    System.out.println("the addition of 2 numbers is "+sum);
	    System.out.println("the substraction of 2 numbers is "+sub);
	    System.out.println("the multiplication of 2 numbers is "+mult);
	    System.out.println("the divition of 2 numbers is "+div);
	    
		
		
		
	}

}
