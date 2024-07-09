package com.tnsif.overriding;

public class sbi extends rbi{
	public float getrateofinterest()
	{
		return 9.9f;
	}
	void display()
	{
		System.out.println(super.getrateofinterest());
	}

}
