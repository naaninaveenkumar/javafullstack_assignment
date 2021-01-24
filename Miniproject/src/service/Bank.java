package service;

interface Bank {
	void withdraw(int accno,int amount);
	void deposit(int accno,int amount);
	void checkbalance(int accno);
}