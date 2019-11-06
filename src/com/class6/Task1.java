package com.class6;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Is it a sale?");
		boolean sale=scan.nextBoolean();
		if(sale) {System.out.println("I am not shopping");}
		else if(!sale) {System.out.println("check the price of item");}
		int price=scan.nextInt();
		double discount;
		double finalprice;
		
		
		if(price<20) {
			discount=price*0.10;
			finalprice=price-discount;
		}
		else if(price>20 && price<100) {
			discount=price*0.20;
			finalprice=price-discount;
		}
		else if(price>100 && price<500) {
			discount=price*0.30;
			finalprice=price-discount;
		}
		else { 
			discount=price*0.50;
			finalprice=price-discount;
		}
		System.out.println("Your discount is "+finalprice);
	}

}
