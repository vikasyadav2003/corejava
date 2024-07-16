package com.tnsif.Exceptionhanling;

import javax.crypto.AEADBadTagException;

public class Division {
public static void divide() {
	int a=6,b=0,c;
	try {
	c=a/b;
	System.out.println("dividion"+c);
	}
	catch(ArithmeticException e) {
		System.out.println("exception caught"+e.getMessage());
	}
	catch(Exception e) {
		System.out.println("exception"+e.getMessage());
	}
	
}
}
