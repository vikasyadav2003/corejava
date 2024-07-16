package com.tnsif.abstraction;

public class square extends Shape{
	
	private float side;
	
	public square() {
		side=2.0f;
	}
	public square(float side) {
		this.side=side;
	}

	@Override
	void calarea() {
		super.area=side*side;
		
	}
	
	

}
