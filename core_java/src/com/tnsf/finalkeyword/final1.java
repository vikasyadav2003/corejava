package com.tnsf.finalkeyword;

public class final1 {
final int a=4;
static final int x;
 static final void change()
{
	 System.out.println("default");
}
	static {
		x=1;
}
	public static void main(String[] args) {
		final1 obj=new final1();
		obj.change();
		System.out.println(final1.x);
	}
}
