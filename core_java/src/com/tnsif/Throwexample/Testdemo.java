package com.tnsif.Throwexample;
import java.util.*;
public class Testdemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the rollno");
	int rollno=sc.nextInt();
	if(rollno<0)
	{
		throw new ArithmeticException("rollno cannot be negative");
	}
	else {
		System.out.println("rolno is positive");
	}
}
}
