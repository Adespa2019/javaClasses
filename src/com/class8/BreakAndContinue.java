package com.class8;

public class BreakAndContinue {
	public static void main(String[]  args) {
		for (int i=0; i<10; i++) {
			if(i==8) {
				break;
			}
			System.out.println(i);	
		}
		System.out.println("I am outside of the loop");
		//continue_ it will skip Current iteration
		for (int i=1; i<=5; i++) {
			if(i==2 || i==5) {
				continue;
			}
			System.out.println(i);	
		}System.out.println("I am outside of the loop");
		//want to print num from 1 to 20 execpt5,6,7
		for(int a=1; a<=20; a++) {
			if(a==5 || a==6 || a==7) {
				continue;
			}
			System.out.println(a);
		}
	}

}
