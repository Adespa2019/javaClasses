package com.class17;

public class ObjectOfcar {
public static void main(String[] args) {
	Car car1=new Car();
	car1.make="Tesla";
	car1.modle="S3";
	car1.color="Black";
	car1.wheels=4;
	car1.Windows=5;
	car1.speed=200;
	//accessing behaveior for object 1
	
	car1.start();
	car1.accelerate();
	car1.drive();
	System.out.println(".........");
	
	Car car2=new Car();
	
	car2.make="BMW";
	car2.modle="i8";
	car2.color="Purple";
	car2.year=2019;
	car2.wheels=4;
	car2.Windows=6;
	car2.speed=300;
	car2.make="Lexus";
	//accessing behaveior for object 2
	
		car2.start();
		car2.accelerate();
		car2.drive();
	//print feature of the car
	System.out.println("I have "+car1.color+" "+car1.make);
//i drive BmW 2019
	System.out.println("I drive "+car2.make+" "+car2.year);
}
}
