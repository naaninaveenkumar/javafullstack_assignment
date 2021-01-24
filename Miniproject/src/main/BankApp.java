package main;

import java.util.Scanner;

import service.MyBank;

public class BankApp {
	
		public static void main(String args[])
		{
			int accno,amount,fromaccno,toaccno,var;
			MyBank mb=new MyBank();
		
		do{
			Scanner sc=new Scanner(System.in);
			System.out.println("\n1.create account with Default details\n2.user defined account creation\n3.Check Account Balance\n4.Withdraw the amount\n5.Deposit\n6.Transfer\n7.Exit the Application\n ");
			System.out.println("choose any option");
			var=sc.nextInt();
			switch(var){
			case 1:  mb.accountcreate();
				 break;
			case 2: sc.nextLine(); 
				System.out.println("Enter name");
				 String name=sc.nextLine();
				 System.out.println("enter amount greater than 500");
				 amount=sc.nextInt();
				sc.nextLine();
				//System.out.println("Enter name");
				 
				 mb.accountcreate(name,amount);
				 break;		
			case 3:  System.out.println("enter account number");
				 accno=sc.nextInt();
				 mb.checkbalance(accno);
				 break;
			case 4:  System.out.println("enter account number");
				 accno=sc.nextInt();
				 System.out.println("enter amount ");
				 amount=sc.nextInt();
				 mb.withdraw(accno,amount);
				 break;
			case 5:  System.out.println("enter account number");
				 accno=sc.nextInt();
				 System.out.println("enter amount ");
				 amount=sc.nextInt();
				 mb.deposit(accno,amount);
				 break;	
			case 6:  System.out.println("enter from-account number");
				 fromaccno=sc.nextInt();
				 System.out.println("enter to-account number");
				 toaccno=sc.nextInt();
				 System.out.println("enter amount ");
				 amount=sc.nextInt();
				 mb.transfer(fromaccno,toaccno,amount);
				 break;	
			case 7:  System.exit(0);
			default: System.out.println("choose valid option");
			
			}
			}while(var<=7);
	}
	}