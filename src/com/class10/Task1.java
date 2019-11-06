package com.class10;

public class Task1 {
	public static void main(String[] args) {
		
		char[] grades;
		grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[1]);
		//second way
		char[] gRades= {'A','B','C','D','E','F'};
		System.out.println(gRades[0]);
		
		String[] names=new String[5];
		names[0]="John";
		names[1]="Ben";
		names[2]="Alex";
		names[3]="Anna";
		names[4]="Josh";
		
		System.out.println(names[4]);
		
		String[] words=new String[5];
		words[0]="Java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="coding";
		words[4]="is";
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		String[] animals= { "cat","dog","Snake","elephant"};
		int size =animals.length;
		for(int i=0; i<size; i++) {
			System.out.print(animals[i]+" ");
		}
	}

}
