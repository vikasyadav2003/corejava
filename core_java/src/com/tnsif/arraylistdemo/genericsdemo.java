package com.tnsif.arraylistdemo;
import java.util.ArrayList;
import java.util.Iterator;
public class genericsdemo {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("vikas");
	al.add("kumar");
	al.add("yadav");
	System.out.println("elements are"+al);
	Iterator<String> itr=al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
