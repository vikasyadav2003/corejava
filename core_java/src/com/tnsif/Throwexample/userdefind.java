package com.tnsif.Throwexample;
import java.util.Scanner;
public class userdefind {
private static int age;
private static void volidate()throws Age{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter age");
	int age=sc.nextInt();
	if(age<18)
	{
		System.out.println("invalid age you are not eliggible");
	}
	else {
		System.out.println("ypu can vote");
	}
	
}
public static void main(String[] args) {
	try{
		userdefind.volidate();
	}
	catch( Age e)
	{
		System.out.println("exception cauht"+e.getMessage());
	}
}
}
