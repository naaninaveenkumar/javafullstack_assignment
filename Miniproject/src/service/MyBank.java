package service;

public class MyBank extends AccountInitialization implements Bank {
	public void transfer(int fromaccno,int toaccno,int amount)
	{
	   int flag=0;
	   int flag1=0;
	   int flag2=0;
	   
		for(int i=0;i<acccount;i++)
		{
			if(fromaccno==ac[i].getaccno())
				{
					flag=1;
					if(ac[i].getamount()<amount)
					{
						flag2=1;
						System.out.println("insufficient funds for transfering");
					}
					
				}
		}
	   
	 try{
		if(flag==0)
			{
			throw new CustomException("from-account number not found");
			}
		}
		catch(Exception e){
		System.out.println(e.toString());
	        }
		for(int i=0;i<acccount;i++)
		{

			if(toaccno==ac[i].getaccno())
				{
					flag1=1;
					
				}
		}
		try{
		if(flag1==0)
			{
			throw new CustomException("to-account number not found");
			}
		}
		catch(Exception e){
		System.out.println(e.toString());
	        }
		if(flag1==1&&flag==1&&flag2==0)
		{
			for(int i=0;i<acccount;i++)
			{

			if(toaccno==ac[i].getaccno())
			{
				
				ac[i].setamount(ac[i].getamount()+amount);
			}
			if(fromaccno==ac[i].getaccno())
			{
				
				ac[i].setamount(ac[i].getamount()-amount);
				try{
					if(ac[i].getamount()<500)
					{
						throw new CustomException("maintain minimum amount 500");
					}
				   }
				catch(Exception e){
					System.out.println(e.toString());
	        		  }
				
				}
			}
			if(flag2==0)
			{
			System.out.println("Transfer Transaction done successfully");
			}
		}
	}

	public void withdraw(int accno,int amount){
	int flag=0;
	try{
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
							throw new CustomException("maintain minimum amount 500");
						}
						
				   	}
			}
		}
	}
	catch(Exception e){
		System.out.println(e.toString());
	}
		try{
		if(flag==0)
			{
			throw new CustomException("account number not found");
			}
		}
		catch(Exception e){
		System.out.println(e.toString());
	        }
	}
		

	public void deposit(int accno,int amount){
		int flag=0;
		int flag1=0;
		for(int i=0;i<acccount;i++)
		{
			if(accno==ac[i].getaccno())
			{
				flag=1;
				if(amount>49999)
				{
					flag1=1;
					System.out.println("cannot deposit more than 49999");
				}
				ac[i].setamount(ac[i].getamount()+amount);
				if(flag==1&&flag1==0)
				{
				System.out.println("deposit Transaction done successfully");
				}
			}
		}
		try{
		if(flag==0)
			{
			throw new CustomException("account number not found");
			}
		}
		catch(Exception e){
		System.out.println(e.toString());
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
		try{
		if(flag==0)
			{
			throw new CustomException("account number not found");
			}
		}
		catch(Exception e){
		System.out.println(e.toString());
	        }
	}
}