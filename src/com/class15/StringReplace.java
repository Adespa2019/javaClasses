package com.class15;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Java classes at Syntax are awesome";
str=str.replace("awesome", "great");
System.out.println(str);
str=str.replace("a", "AA");
//replace All
// lets remove all special characters
str=str.replaceAll("[^A-Za-z0-9]", "" );
System.out.println(str);

//split
String str2="Java classes at Syntax are awesome";
String[] array=str2.split("a");
System.out.println(array.length);
}

}
