package com.tnsif.ineritace;

public class child extends father {
String cycle="pink";
String car="audi";
public static void main(String[] args) {
	child obj=new child();
	System.out.println(obj.car);
	System.out.println(obj.car);
	System.out.println(obj.cycle);
	System.out.println(obj.money);
}
}
