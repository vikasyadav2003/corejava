package com.tnsif.comparableinterface;
import java.util.ArrayList;
import java.util.Collections;
public class Demo {
public static void main(String[] args) {
	ArrayList<Student> a=new ArrayList<Student>();
	Student s=new Student(1,"vikas","cse");
	a.add(s);
	 s=new Student(2,"ramu","ece");
	 a.add(s);
	 s=new Student(3,"raju","eee");
	 a.add(s);
		
		System.out.println("before sorting" +a);
		
		System.out.println("after sorting ");
		Collections.sort(a);
		System.out.println(a);
		
		
}
}
