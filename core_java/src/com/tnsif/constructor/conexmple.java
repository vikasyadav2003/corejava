package com.tnsif.constructor;

public class conexmple {
	conexmple(){
		System.out.println("no parameter");
	}
	conexmple(int i)
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		conexmple obj1=new conexmple();
		conexmple obj2=new conexmple(5);
	}
}
