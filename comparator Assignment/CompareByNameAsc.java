package com;

import java.util.Comparator;

import bean.Emp;

public class CompareByNameAsc implements Comparator<Emp> {
	public int compare(Emp o1, Emp o2) {
	   return o1.getName().compareTo(o2.getName());
	}

}
