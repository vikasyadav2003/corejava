package com.tnsif.simple;

public class Nestedinterface implements Interface1.interface2 {
public void display1()
{
	System.out.println("message");
}
	public void display2()
	{
		System.out.println("message2");
	}
	public static void main(String[] args) {
		Nestedinterface  obj=new Nestedinterface();
		obj.display1();
		obj.display2();
		
	}
}
