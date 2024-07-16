package com.tnsif.staticex;

public class Staticexample {
int rollno;
String name;
static String collegename="sri indu";

Staticexample( int a,String b){
	rollno=a;
	name=b;
}
void display() {
	System.out.println(rollno+" "+name+" "+collegename);
}
public static void main(String[] args) {
	Staticexample obj1=new Staticexample(1,"vikas");
	Staticexample obj2=new Staticexample(2,"vikas");
	obj1.display();
	obj2.display();
}
}
