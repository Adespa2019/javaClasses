package com.class6;

public class ClassTask { public static void main(String[] args)
	
	 {
		
		String timeOfSeason=null;
		String month=("september");
		
		if(month.equals("janary") || month.equals("feb") || month.equals("march")){
			timeOfSeason=("winter");
			
		}else if(month.equals("april") || month.equals("may") || month.equals("june")) {
			timeOfSeason=("spring");}
		else if(month.equals("july") || month.equals("August") || month.equals("september")){
			timeOfSeason=("summer");}
		else if(month.equals("october") || month.equals("nevember") || month.equals("december")) { 
			timeOfSeason=("fall");}
			
		
		
	 else { System.out.println("invalid month");}
		System.out.println(month);
		System.out.println(timeOfSeason);
		
		
	}

}
