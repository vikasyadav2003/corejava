package com.tnsif.Interface;

public class Demo implements Childinterface{
public void print() {
	System.out.println("print");
}
public void show() {
	System.out.println("show");
}
public static void main(String[] args) {
	Demo obj=new Demo();
	obj.print();
	obj.show();
}
}
