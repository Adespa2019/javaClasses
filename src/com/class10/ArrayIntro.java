package com.class10;

public class ArrayIntro {
public static void main(String[]  args) {
	// declare an Array
	int [] b;
	b=new int[4];
	// second way all in one line (declaration or initialization)
	int[] array=new int[4];
	array[0]=10;
	array[1]=20;
	array[2]=30;
	array[3]=40;
	//access value from an array
	System.out.println(array[2]);
	// lets create an array that will store classes
	String[] classes=new String[4];
	classes[0]="Java";
	classes[1]="SDLC";
	classes[2]="Manual Testing";
	classes[3]="GIT";
	//Today is Java class
	System.out.println("Today we have "+classes[0]+" class");
	int[] nums=new int[3];
	nums[0]=1;
	nums[1]=2;
	nums[2]=3;
	//how to change  to 100
	nums[0]=100;
	System.out.println(nums[0]);
	System.out.println(nums[0]+nums[2]);//100+3
	// the size of array fixed
	String[] names=new String[3];
	names[0]="Diana";
	names[1]="Seda";
	names[2]="Olga";
	//names[3]="Jaime"; run tme we get exection Array IndexoutofBoundsExceptin
	System.out.println(names[3]);
	//we were puting less elements inside
	//compiler will give default values
	int[] numbers=new int[4];
	numbers[1]=100;
	numbers[3]=200;
	
	System.out.println(numbers[0]);
			}
}
