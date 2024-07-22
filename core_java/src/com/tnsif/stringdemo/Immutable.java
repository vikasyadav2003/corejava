package com.tnsif.stringdemo;

public class Immutable {
public static void main(String[] args) {
	String s1="vikas";
	String s2=s1;
	String s3=s2;
	System.out.println("STring1= "+s1+"\n string2= "+s2+"\nstring3= "+s3);
	 s1="kumar";
	System.out.println("string1= "+s1+"\n String2= "+s2+"\n string3= "+s3);
}
}
