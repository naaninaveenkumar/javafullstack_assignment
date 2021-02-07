package com.bean;

public class Customer {
private String firstname;
private String lastname;
private int age;
private String gender;
private int phnnumber;
private String username;
private String password;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getPhnnumber() {
	return phnnumber;
}
public void setPhnnumber(int phnnumber) {
	this.phnnumber = phnnumber;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Customer(String firstname, String lastname, int age, String gender, int phnnumber, String username,
		String password) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.age = age;
	this.gender = gender;
	this.phnnumber = phnnumber;
	this.username = username;
	this.password = password;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", gender=" + gender
			+ ", phnnumber=" + phnnumber + ", username=" + username + ", password=" + password + "]";
}


}
