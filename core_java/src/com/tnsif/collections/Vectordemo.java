package com.tnsif.collections;
import java.util.Vector;
public class Vectordemo {
public static void main(String[] args) {
	Vector<String> v=new Vector<String>();
	v.add("raju");
	v.add("ramu");
	v.add("rajesh");
	System.out.println(v.capacity());
	v.add("vikas");
	v.add("vijjy");
	v.add("raju");
	v.add("raju");
	v.add("raju");
	v.add("vikas");
	v.add("vijjy");
	v.add("raju");
	v.add("raju");
	v.add("raju");
	v.add("vikas");
	v.add("vijjy");
	v.add("raju");
	v.add("raju");
	v.add("raju");
	System.out.println(v.capacity());
}
}
