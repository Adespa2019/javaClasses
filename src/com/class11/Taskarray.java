package com.class11;

public class Taskarray {
	public static void main(String[] args) {
		int[] cars= {1,2,3,4,5,6};
		for(int ca:cars) {
			System.out.println(ca+" ");
		}
		int[] nums= {2,4,6,8};
		int i=0;
		for(int nu:nums) {
	i=i+nu;
			System.out.println(i);
		}
		String[] country= {"USA","PAKISTAN"};
		String[] capital= {"Washington","Islamabad"};
		
		for(String co:country) {
		if (co.equals("USA")) {
			System.out.println(capital[0]);
		}
		if (co.equals("PAKISTAN")){
			 System.out.println(capital[1]);
		}
	}

}}
