package com.tnsif.collections;
import java.util.Stack;
public class Stackdemo {
	public static void main(String[] args) {
Stack<Integer> ob=new Stack<Integer>();
ob.push(2);
ob.push(3);
ob.push(6);
System.out.println(ob);
System.out.println(ob.peek());
System.out.println(ob.isEmpty());
}
}