package com.tnsif.Exceptionhanling;

public class Nestedtrycatch {
public static void check() {
	String str="tns";
	int slength=str.length();
	System.out.println("stringlength"+slength);
	String anotr=null;
	int y=6;
	try {
		try {
		System.out.println(str.charAt(y));
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println("index out of bound exception"+ex.getMessage());
		}
		System.out.println("another string"+anotr.length());
	}
	catch(NullPointerException ope) {
		System.out.println("null string exception"+ope.getMessage());
	}

}
}
