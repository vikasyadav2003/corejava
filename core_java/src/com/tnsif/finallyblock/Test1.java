package com.tnsif.finallyblock;

public class Test1 {
public static void main(String[] args) {
	try {
		System.out.println(100/0);
		
	}
	catch(ArithmeticException e) {
		System.out.println("excEption caugt"+e.getMessage());
	}
	finally {
		System.out.println("finally");
	}
	System.out.println("end");
}
}

