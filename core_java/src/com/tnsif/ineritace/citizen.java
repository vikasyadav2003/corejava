package com.tnsif.ineritace;

public class citizen {
private String name;
private long aadharno;
private String address;
private long phoneno;
public citizen(String name, long aadharno, String address, long phoneno) {
	super();
	this.name = name;
	this.aadharno = aadharno;
	this.address = address;
	this.phoneno = phoneno;
}
public citizen()
{
	
}
public String getName()
{
return name;	
}
public void setName(String name) {
	this.name=name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public long getPhno() {
	return phoneno;
}

public void setPhno(long phno) {
	this.phoneno = phoneno;
}
@Override
public String toString() {
	return "citizen [name=" + name + ", aadharno=" + aadharno + ", address=" + address + ", phoneno=" + phoneno + "]";
}

}
