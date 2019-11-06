package com.class11;

public class Taskarray3 {
public static void main(String[] args) {
	int [][] numbers= {
			{4,5,6},
			{7,8,9},
			{2,4,6}
	};
	int lengthOfRows=numbers.length;
    System.out.println(lengthOfRows);
    
    int lengthOfCols=numbers[1].length;
    System.out.println(lengthOfCols);
    for(int getArrays[]: numbers) {
        for(int getNumber: getArrays) {
            
            System.out.print(getNumber+" ");
            
        }
        System.out.println();} 
    
    int sum1=0;
    for (int nums[]: numbers) {
    	for(int getNum:nums) {
    		sum1=sum1+getNum;
    	}
    	System.out.println("The sum of all elements in the array in ="+sum1);
    	
   
    }
}
}
