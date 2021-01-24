package com;

import java.util.Comparator;

import bean.Emp;

public class CompareBySalaryDesc implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o2.getSalary()-o1.getSalary();
	}

}
