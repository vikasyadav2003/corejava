package com.tnsif.abstraction;

public abstract class Shape {
protected float area;
		abstract void calarea();
	void show() {
		System.out.println("area of square "+area);
	}

}
