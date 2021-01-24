package bean;

public class Account{
	private int accno;
	private String name;
	private int amount; 
	
public Account(int accno,String name,int amount){
	this.accno=accno;
	this.name=name;
	this.amount=amount;
	}

public int getaccno(){
return accno;
}
public void setaccno(){
this.accno=accno;
}
public String getname(){
return name;
}
public void setname(){
this.name=name;
}
public int getamount(){
return amount;
}
public void setamount(int amount){
this.amount=amount;
}
public Account() {
	super();
	// TODO Auto-generated constructor stub
}

}	
