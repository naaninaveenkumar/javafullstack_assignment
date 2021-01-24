package service;
import bean.Account;

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
