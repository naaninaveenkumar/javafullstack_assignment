package bean;


import java.time.LocalDate;

public class Product {
private int pid;
private String pname;
private float pprice;
//private LocalDate storedate;
public Product() {
	super();
	// TODO Auto-generated constructor stub
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
///public LocalDate getStoredate() {
//	return storedate;
//}
//public void setStoredate(LocalDate storedate) {
//	this.storedate = storedate;
//}
public Product(int pid, String pname, float pprice, LocalDate storedate) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pprice = pprice;
	//this.storedate = storedate;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
}



}
