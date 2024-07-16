package com.tnsif.staticex;

public class Staticclasseaxample {
private static int a=26;

public static class Nestedclass{
	void display()
	{
		System.out.println(a);
	}
}
public static void main(String[] args) {
	Staticclasseaxample.Nestedclass obj=new Staticclasseaxample.Nestedclass();
	obj.display();
}


}




