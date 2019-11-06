package com.class7;

public class WhileLoopPractice {
	public static void main(String[] args) {
		int a=50;
		while (a>=20) {
			System.out.print(a+" ");
			a--;
		}
		System.out.println("..............");
		// even numbers
		int z=2;
		while(z<=20) {
			System.out.println(z);
			z+=2;
		}
		//even number modulus
		int q=1;
		while(q<=20) {
			if (q%2==0) {
				System.out.println(q);
			}q++;
		}
		System.out.println("*************");
	//odd number 
		int b=100;
		while(b>=50) {
			if(b%2==1) {
			System.out.println(b);}
			b--;
		}System.out.println("$$$$$$$$$$$$$$");
		int c=100;
		while(b>=50) {
			if(c%2==0) {
				System.out.println(c);
			} c++;
		}
	}

}
