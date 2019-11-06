package com.class9;

public class PatternRowCol {
public static void main(String[] args) {
	for(int i=0; i<4;i++) {//rows
		for(int j=1; j<5; j++) {//cols
			System.out.print("&");
		}System.out.println();
	}
	//print
	/*12345
	 * 12345
	 * 12345
	 * 12345
	 */
	for(int i=1; i<=5; i++) {
		for(int j=1; j<10; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	//////
	for(int f=5; f>=1; f--) {
		for(int e=5; e>=1; e--) {
			System.out.print(f);
		} System.out.println();
	}
		
}
}
