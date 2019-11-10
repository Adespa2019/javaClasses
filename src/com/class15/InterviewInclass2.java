package com.class15;

import java.util.Arrays;

public class InterviewInclass2 {

	public static void main(String[] args) {
		/*
		 * Write a java program to find the second
		 * largest number in the array?
		 * Maximum and minimum number in the array?
		 */
int []array = {100,-90,8787,898,0,1};
//1 easiest way 
Arrays.sort(array);
int min=array[0];
int max=array[array.length-1];
System.out.println(min);
System.out.println(max);
//2 way
int [] Myarray = {100,-90,8787,898,0,1};
int largest=Myarray[0];
int smallest=Myarray[0];
for(int i=0; i<Myarray.length; i++) {
	if (Myarray[i]>largest) {
		largest=Myarray[i];
	}if (Myarray[i]<smallest) {
		smallest=Myarray[i];
	}
}System.out.println("The smallest value in the array is "+smallest);
System.out.println("The largest value in the array is "+largest);

//Write a java program to find the second
int [] myArray = {100,-90,8787,898,0,1,-90,898};
int large=myArray[0];
int secondLarge=myArray[0];

for (int i=0; i<myArray.length; i++) {
	if(myArray[i]>large) {
		secondLarge=large;
		large=myArray[i];
	}if(myArray[i]>secondLarge && myArray[i]<large) {
	secondLarge=myArray[i];
}
}
System.out.println("The secondLarge value in the array is "+secondLarge);
System.out.println("The large value in the array is "+large);

}}
