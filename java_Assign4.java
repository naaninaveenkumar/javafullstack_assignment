import java.util.Scanner;
class Employee{
	int id;
	String name;
	int sal;
	Scanner sc=new Scanner(System.in);
	Address a=new Address();
	void read()
	{	
		System.out.println("enter id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name:");
		name=sc.nextLine();
		System.out.println("enter salary:");
		sal=sc.nextInt();
	}
	void calsal()
	{
		sal=sal+(int)((sal*.1)+(sal*.07)-(sal*.05));
	}
	void display()
	{
		System.out.println("id:    	\t"+id);
		System.out.println("name:    \t"+name);
		System.out.println("sal: 	\t"+sal);
	}
}
class Manager extends Employee{
	int noemp;
	Scanner sc=new Scanner(System.in);
	void readmgr()
	{
		System.out.println("enter no of employees:");
		noemp=sc.nextInt();
		System.out.println("enter address details:");
		a.readadd();
	}	
	void displaym()
	{
		System.out.println("no of employees\t"+noemp);
		System.out.println("-------------------address---------------------------->");
		a.disadd();
	}
}
class Programmer extends Employee{
	String projname;
	Scanner sc=new Scanner(System.in);
	void readpro()
	{
		System.out.println("Enter project name:");	
		projname=sc.nextLine();
		System.out.println("enter programmer address details:");
		a.readadd();
	}
	void displayp()
	{
		System.out.println("project name is\t:"+projname);
		System.out.println("-------------------address---------------------------->");
		a.disadd();
	}
}
class Address{
	int pincode;
	String city,state;
	Scanner sc=new Scanner(System.in);
	void readadd()
	{
		System.out.println("Enter your city:");
		city=sc.nextLine();
		System.out.println("Enter your state:");
		state=sc.nextLine();
		System.out.println("Enter your pincode:");
		pincode=sc.nextInt();	
	}
        void disadd()
	{
	System.out.println("state:   	\t"+state);
	System.out.println("city:    	\t"+city);
	System.out.println("pincode: 	\t"+pincode);
	}
}
class EmployeeTest{
	public static void main(String args[])
	{
		
		Manager m=new Manager();
		Programmer p=new Programmer();
		m.read();
		m.readmgr();
		m.calsal();
		p.read();
		p.readpro();
		p.calsal();
		System.out.println("-----------------manager details-----------------");
		m.display();				
		m.displaym();
		System.out.println("-----------------programmer details-----------------");
		p.display();
		p.displayp();
	}
}

