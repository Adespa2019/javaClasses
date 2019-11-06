package com.class12;

public class StringManipu4 {
public static void main(String[] args) {
	//startsWith
	String str2="It is very hot inthe class";
	System.out.println("Is this string starts with="+str2.startsWith("It"));
	//System.out.println("Is this string starts with="+str2.startsWith("is",3));
	//endsWith
	System.out.println("Is this string ends with="+str2.endsWith("class"));
	// this method checks whether string is empty or not.
	String str="";
	System.out.println("Is this string empty="+str.isEmpty());
	String str3="hello";
	System.out.println("Is this string empty="+str3.isEmpty());
	
	// \n	
	String sentence="Eachday has a promise to brighten up the day,\n but first you must allow the sun to come your way";
System.out.println(sentence);
// .concat
String str5="Hello";
String str6="World";
System.out.println(str5+" "+str6);
System.out.println(str5.concat(" "+str6));

// this method returns a copy of the string,
// with leading and trailing whitespace omitted
String str7="How are you?";
System.out.println(str7.trim());
// this method returns the character located at strig specified index
//the strinng indexes starts from zero
String str8="WE might be done early today";
System.out.println(str8.charAt(3));

//this method returns the index within this string of the
//first occurrence of the specified charcter or -1
//if the character does not occur
String str9="WE might mnot be done early today";
System.out.println(str9.indexOf('m'));
System.out.println(str9.indexOf('m',12));


}
}
