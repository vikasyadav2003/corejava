package com.tnsif.arraylistdemo;
import java.util.LinkedList;
public class Linkedlistdemo {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(1);
	l1.add("vikas");
	l1.add("kumar");
	System.out.println(l1);
	l1.add(1,"m ");
	l1.addFirst("m. ");
	l1.addLast(".");
	
	System.out.println(l1);
}
}
