package com;

import java.util.Comparator;

import bean.Emp;

public class CompareById implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
}

