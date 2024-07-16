package com.tnsif.Interface;

public class Nestedinterface implements Interface1.Interface2{
public void print()
{
System.out.println("in my inner intrface");	
}
public static void main(String[] args) {
	Nestedinterface obj=new Nestedinterface();
	obj.print();
	System.out.println(obj.id);
}
}
