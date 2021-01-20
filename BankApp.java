import java.util.Scanner;
abstract class AccountInitialization{
	static int acccount=0;
	int accno=1010;
	int amount;
	String name;
	Account ac[]=new Account[10];
	public void accountcreate() {
		accno++;
		name="Unknown";
		amount=500;
		ac[acccount]= new Account(accno,name,amount);
		acccount++;
		System.out.println("Account created Successfully");			
		}
	public void accountcreate(String name,int amount) {
		if(amount>500)
		{
			accno++;
			ac[acccount]= new Account(accno,name,amount);
			acccount++;
			System.out.println("Account created Successfully");	
		}
		else
		{
			System.out.println("Account is rejected");
		}		
	}

	abstract void transfer(int fromaccno,int toaccno,int amount);

}

interface Bank {
		void withdraw(int accno,int amount);
		void deposit(int accno,int amount);
		void checkbalance(int accno);
}

class Account{
			private int accno;
			private String name;
			private int amount; 
		Account(int accno,String name,int amount){
			this.accno=accno;
			this.name=name;
			this.amount=amount;
			}
	public int getaccno(){
		return accno;
	}
	public void setaccno(){
		this.accno=accno;
	}
	public String getname(){
		return name;
	}
	public void setname(){
		this.name=name;
	}
	public int getamount(){
		return amount;
	}
	public void setamount(int amount){
		this.amount=amount;
	}
}	

class MyBank extends AccountInitialization implements Bank {
	Scanner sc=new Scanner(System.in);
	int flag=0;
	int flag1=0; 
	public void transfer(int fromaccno,int toaccno,int amount)
	{
		for(int i=0;i<acccount;i++)
		{
			if(fromaccno==ac[i].getaccno())
				{
					flag=1;
					if(ac[i].getamount()<amount)
					{
						System.out.println("insufficient for transfering");
					}
					else{
						ac[i].setamount(ac[i].getamount()-amount);
						if(ac[i].getamount()<500)
							{
							System.out.println("maintain minimum amount 500");
							}
					}	
				}
		}
		if(flag==0)
		{
		System.out.println("from-account number not found");
		}
		for(int i=0;i<acccount;i++)
		{

			if(toaccno==ac[i].getaccno())
				{
					flag1=1;
					ac[i].setamount(ac[i].getamount()+amount);
					System.out.println("Transfer Transaction done successfully");
					
				}
		}
		if(flag1==0)
			{
				System.out.println("to-account number not found");
			}
		
	}

	public void withdraw(int accno,int amount){
		int flag=0;
		for(int i=0;i<acccount;i++)
		{
			if(accno==ac[i].getaccno())
			{
				flag=1;
				if(ac[i].getamount()<amount)
					{
						System.out.println("amount is not available");
					}
				else
					{	
						ac[i].setamount(ac[i].getamount()-amount);
						System.out.println("Withdraw Transaction done successfully");
						if(ac[i].getamount()<500)
						{
							System.out.println("maintain minimum amount 500");
						}
				   	}
			}
		}
	
		if(flag==0)
		{
			System.out.println("account number not found");
		}
	}
		

	public void deposit(int accno,int amount){
		int flag=0;
		for(int i=0;i<acccount;i++)
		{
			if(amount>49999)
			{
				System.out.println("cannot deposit more than 500");
			}
			if(accno==ac[i].getaccno())
			{
				flag=1;
				ac[i].setamount(ac[i].getamount()+amount);
				System.out.println("deposit Transaction done successfully");
			}
		}
		if(flag==0)
			{
				System.out.println("account number not found");
			}
		
	}


	public void checkbalance(int accno){
		int flag=0;
		for(int i=0;i<acccount;i++)
		{
			if(accno==ac[i].getaccno())
			{
				flag=1;
				System.out.println("balance rs."+ac[i].getamount());
			}
		}
		if(flag==0)
		{
			System.out.println("account number not found");
		}
	}
}
		
class BankApp{
	public static void main(String args[])
	{
		int accno,amount,fromaccno,toaccno,var;
		
		System.out.println("choose any option");
	
		MyBank mb=new MyBank();
	
	do{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n1.create account with Default details\n2.user defined account creation\n3.Check Account Balance\n4.Withdraw the amount\n5.Deposit\n6.Transfer\n7.Exit the Application\n ");
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