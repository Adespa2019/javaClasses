
  package com.class5;

import java.util.Scanner;

public class Testing {
	 


	public static void main(String[] args){
	   
		Scanner scan=new Scanner(System.in);
	    
	    String name = null;
	    System.out.println("Enter name of the instructor");
	    String input;
	     input=scan.nextLine();
	    switch (name){
	      case "Shiva":
	        System.out.println("Will take care of Java Assignment");
	        break;
	        case "Sandish":
	          System.out.println("Will take care of SDLC Assignment");
	          break;
	          case "Weqas":
	            System.out.println("Will take care of Selenium Assignment");
	            break;
	            case "Asel":
	            System.out.println("Will take care of every Assignment");
	            break;
	            default:
	            System.out.println("Invalid instructor selected");
	        break;
	    }
	  }
	}