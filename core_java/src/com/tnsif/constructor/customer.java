package com.tnsif.constructor;

public class customer {
	private String cname;
	private int cid;
	private String caddress;
	public customer() {
	}
	public customer(String cname, int cid, String caddress) {
		this.cname = cname;
		this.cid = cid;
		this.caddress = caddress;
	}	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", cid=" + cid + ", caddress=" + caddress + "]";
	}
	

}
