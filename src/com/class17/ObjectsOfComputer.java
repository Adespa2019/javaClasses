package com.class17;

public class ObjectsOfComputer {

	public static void main(String[] args) {
	Computer computer=new Computer();
	computer.brand="Apple";
	computer.name="Macbook Pro";
	computer.keyboard=true;
	computer.screen=15;
	computer.memory=250;
	
	//print feature of your computer
	System.out.println("I have "+computer.brand+computer.name+" memory "+computer.memory);
	}

}
