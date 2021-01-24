package bean;

import java.io.Serializable;

public class Product implements Serializable {
private int pid;
private String pname;
private int price;
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
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int pid, String pname, int price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.price = price;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
}


}

