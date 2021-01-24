package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import bean.Emp;

public class EmpTest {

	public static void main(String[] args) {
		List<Emp> loe=new ArrayList<>();
		Emp e=new Emp(1,"navee",1200);
		Emp e1=new Emp(3,"avee",1300);
		Emp e2=new Emp(2,"mavee",1100);
		loe.add(e2);
		loe.add(e1);
		loe.add(e);
		int var;
		do {
		System.out.println("choose type of order:");
		System.out.println("1.Ascending order by Id\n2.Descending order by Id\n3.Ascending order by name\n4.Descending order by name\n5.Ascending order by salary\n6.Descending order by salary");
		Scanner sc=new Scanner(System.in);
		var=sc.nextInt();
		switch(var)
		{
		case 1:		Collections.sort(loe,new CompareById());			
					System.out.println();
					System.out.println("After Sort");
					for(Emp i : loe) {
						System.out.println(i);
		              }
					break;
		case 2:		Collections.sort(loe,new CompareByIdDesc());			
					System.out.println();
					System.out.println("After Sort");	
					for(Emp i : loe) {
						System.out.println(i);
		              }
					break;
					
		case 3:		Collections.sort(loe,new CompareByNameAsc());			
					System.out.println();
					System.out.println("After Sort");
					for(Emp i : loe) {
						System.out.println(i);
			          }
					break;
					
		case 4:		Collections.sort(loe,new CompareByNameDesc());			
					System.out.println();
					System.out.println("After Sort");
					for(Emp i : loe) {
						System.out.println(i);
			          }
					break;
					
		case 5:	    Collections.sort(loe,new CompareBySalaryAsc());			
					System.out.println();
					System.out.println("After Sort");
					for(Emp i : loe) {
					System.out.println(i);
					}
					break;
		
		case 6:		Collections.sort(loe,new CompareBySalaryDesc());			
					System.out.println();
					System.out.println("After Sort");
					for(Emp i : loe) {
					System.out.println(i);
                   }
					break;
					
		default:  System.out.println("enter valid choice");
					break;
		
		}
		}while(var<6);
		}

}
