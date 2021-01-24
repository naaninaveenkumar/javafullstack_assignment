package com;

import java.util.Comparator;

import bean.Emp;

public class CompareByNameDesc implements Comparator<Emp> {
	public int compare(Emp o1, Emp o2) {
		   return o2.getName().compareTo(o1.getName());
	}

}
