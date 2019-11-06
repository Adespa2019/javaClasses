package com.class14;

public class InterQ10 {

	public static void main(String[] args) {

int num=0,num1=1,num2,i,count=10;
System.out.print(num+" "+num1);
for(i=3; i<count; ++i) {
	num2=num+num1;
	System.out.print(" "+num2);
	
	num=num1;
	num1=num2;
}
	}

}
