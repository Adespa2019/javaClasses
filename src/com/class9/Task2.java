package com.class9;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the starting Integer");
		int start=scan.nextInt();
		System.out.println("enter the end Interger");
		int end=scan.nextInt();
		int sumEven=0;
		int sumOdd=0;
		for(int i=start; i<=end; i++) {
			if(i%2==0) {
				sumEven=sumEven+i;
			}System.out.println(i);
			for(int j=start; j<=end; j++) {
				if(i%2!=0)
				sumOdd=sumOdd+j;
			}System.out.println("The sum of even number"+sumEven);
			System.out.println("The sum of odd number"+sumOdd);
		}
	}

}
