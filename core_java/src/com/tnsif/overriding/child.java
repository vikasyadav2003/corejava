package com.tnsif.overriding;

public class child extends father {
void drinking() {
	System.out.println("horlics");
	super.drinking();
}
public static void main(String[] args) {
	child c=new child();
	c.drinking();
}
}
