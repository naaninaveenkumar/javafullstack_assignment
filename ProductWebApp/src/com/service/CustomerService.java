package com.service;

import com.bean.Customer;
import com.dao.CustomerDao;

public class CustomerService {

	CustomerDao cd=new CustomerDao();
	public int createAccount(Customer c)
	{
		if(cd.createAccountDao(c)>0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public int login(String user,String pass)
	{
		int res=cd.checkLogin(user, pass);
		return res;
	}
	
	
}
