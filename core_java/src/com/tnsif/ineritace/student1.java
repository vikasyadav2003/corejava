package com.tnsif.ineritace;

public class student1 extends citizen {
	private int rollno;
	private String collegename;
	
	public student1() {
		System.out.println("welcome");
	}
	public student1( int rollno, String collegename) {
		
		this.rollno = rollno;
		this.collegename = collegename;
	}
	
	public student1(String name,long adharno,String  address,long phno) {
		super(name,adharno,address,phno);
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	@Override
	public String toString() {
		return "student1 [rollno=" + rollno + ", collegename=" + collegename + "]";
	}
	
}
