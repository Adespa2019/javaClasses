package com.class11;

public class TwodimentinalArray {
public static void main(String[] args) {
	
	// 2D Array
	int [][] array= new int[3][4];
	// row 1
	array[0][0]=2;
	array[0][1]=4;
	array[0][2]=6;
	array[0][3]=8;
	//row 2
	array[1][0]=1;
	array[1][1]=3;
	array[1][2]=5;
	array[1][3]=7;
	//row 3
	array[2][0]=0;
	array[2][1]=9;
	array[2][2]=8;
	array[2][3]=7;
	System.out.println(array[2][2]);
	//
	int [][]numbers= {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	System.out.println(numbers[2][1]);
	//to identify the numbers rows
	System.out.println("the numbers of rows are :="+numbers.length);
	// to identify the number of columns/elements
	System.out.println("the number of rows are :="+numbers[1].length);
	
	
}

}
