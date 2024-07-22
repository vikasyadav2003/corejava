package com.tnsif.stringdemo;

public class stringbufferdemo {
public static void main(String[] args) {
	StringBuffer b2=new StringBuffer("welcome ");
	b2.append("to java");
	System.out.println(b2);
	b2.insert(1, "hi");
	System.out.println(b2);
	b2.delete(2, 3);
	System.out.println(b2);
	System.out.println(b2.reverse());
}
}
