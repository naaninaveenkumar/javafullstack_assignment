package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.Product;
import com.dao.Dao;

public class Service {
		Dao d=new Dao();
		Product p;
		List<Product> list=new ArrayList<Product>();
	public String insert(Product p)
	{
		try {
			if(p.getPprice()<0)
			{
				return "Price should be positive";
			}
			else if(p.getPprice()<500 && p.getPprice()>0) {
				return "price must be grater than 500";
			}
			else if((d.addProduct(p))>0) {
				return "record added successfully";
			}
		}catch (Exception e) {
			System.out.println(e.toString());
		}
			
				return "record didnt stored";	
	}
	
	public String update(int id,float price,int quantity)
	{
		try {
			if(price<0)
			{
				return "price must be positive";
			}
			else if(price<500 && price>0)
			{
				return "price must be greater than 500";
			}
			else if(d.updateProduct(id, price, quantity)>0)
			{
				return "updated successfully";
			}
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		return "record not found";
	}
	
	public String delete(int id)
	{
		try {
			
			if(d.deleteProduct(id)>0) {
				return "Record deleted successfully";
			}
			else {
				return "Record didn't find";
			}
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		return "record not found";
	}
	
	public List<Product> display() {
		
		list=d.retrive();
		return list;
	}
	
	public String order(int id,int quantity) 
	{
		if(quantity<=0)
		{
			return "quantity must be atleast 1";
		} else
			try {
				if(d.orderProduct(id, quantity)>0)
				{
					return "Product Ordered Successfully";
				}
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		return "Order Failed";
	}
}





