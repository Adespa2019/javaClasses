package com.class8;

public class Task2 {
	public static void main(String [] args) {
		/*sum of even and odd numbers
		 * from range 1 to 20 i
		 * expecting 2 outputs
		 * sum for odd num=...
		 * sum for even num=....
		 * 
		 */
		int sumEven=0;
		int sumOdd=0;
		for (int i=1; i<=20; i++) {
			
			if (i%2==0) {
				System.out.println(i);	
				sumEven=sumEven+i;
			}
			else {
				System.out.println(i);	
				sumOdd=sumOdd+i;
			}
		}
		System.out.println("The total of all even#="+ sumEven);
		System.out.println("The total of all odd#="+ sumOdd);
	}

}
