package com.tnsif.simple;

public class Child extends Father {
	public void drinking()
	{
		super.drinking();
		System.out.println("horlics");
	}
public static void main(String[] args) {
	Child obj=new Child();
	obj.drinking();
}
}
