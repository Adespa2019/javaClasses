package com.class10;

public class ArrayDemo {
	public static void main(String[] args) {
		
		int[] nums=new int[4];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		// to find the number of elements inside in array we .length
		System.out.println(nums.length);
		
		String[] array= {"Winter", "Fall","Summer","Spring"};
		//i was born in Summer
		System.out.println("I was born in "+array[2]);
		int arraySize=array.length;
		System.out.println(arraySize);
	}

}
