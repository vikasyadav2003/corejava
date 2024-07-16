package com.tnsif.constructor;
import java.util.*;
public class Customerdemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name");
	String name=sc.nextLine();
	System.out.println("enter your id");
	int id=sc.nextInt();
	System.out.println("enter your address");
	String add=sc.nextLine();
	customer c=new customer();
	c.setCname(name);
	c.setCid(id);
	c.setCaddress(add);
	System.out.println(c);
	boolean out= c instanceof customer;
	System.out.println(out);
}
}
