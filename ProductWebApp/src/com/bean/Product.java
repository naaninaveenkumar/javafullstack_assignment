package com.bean;

public class Product {
private int pid;
private String pname;
private float pprice;
private int quantity;
private int ordered;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int pid, String pname, float pprice, int quantity, int ordered) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pprice = pprice;
	this.quantity = quantity;
	this.ordered = ordered;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public float getPprice() {
	return pprice;
}
public void setPprice(float pprice) {
	this.pprice = pprice;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getOrdered() {
	return ordered;
}
public void setOrdered(int ordered) {
	this.ordered = ordered;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", quantity=" + quantity + ", ordered="
			+ ordered + "]";
}



}
