package com.tnsif.constructor;

public class parameterizedcon {
	parameterizedcon()
	{
		System.out.println("default");
	}
	parameterizedcon(int i){
		System.out.println("hello");
	}
	parameterizedcon(int i,int j)
	{
		System.out.println("sme type");
		System.out.println(i);
		System.out.println(j);
	}
	parameterizedcon(int i,String s)
	{
		System.out.println("different type");
		System.out.println(i);
		System.out.println(s);
	}
	public static void main(String[] args) {
		parameterizedcon o1=new parameterizedcon();
		parameterizedcon o2=new parameterizedcon(6,7);
		parameterizedcon o3=new parameterizedcon(9,"vikas");
	}
}
