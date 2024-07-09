package com.tnsif.staticex;

public class student {
int rollno;
String name;
static String colege="sriindu";
static void change() {
	colege="it";
}
student(int r,String n){
	rollno=r;
	name=n;
}
void display() {
	System.out.println(rollno+name+colege);
}
}
