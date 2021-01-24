package com;

import java.util.Comparator;

import bean.Emp;

public class CompareByIdDesc implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o2.getId()-o1.getId();
	}
}
