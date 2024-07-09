package com.tnsif.staticex;

public class staticex1 {
int eid;
String name;
static String companyname="tnsif";
staticex1(int r,String n){
	eid=r;
	name=n;
}
void display()
{
	System.out.println(eid+name+companyname);
}
}
