import java.util.Scanner;
class Student{
	int id,age;
	String name;
	String grade;
	int marks[]=new int[4];

	Scanner sc=new Scanner(System.in);
  	void read(){
	System.out.println("enter id");
	id=sc.nextInt();
	sc.nextLine();
	System.out.println("enter name");
	name=sc.nextLine();
	System.out.println("enter age");
	age=sc.nextInt();
	for(int i=0,j=1;i<4;i++,j++)
	{
		System.out.println("enter mark of subject "+j);
		marks[0]=sc.nextInt();
	} 
	}

	void calgrade(){
	int tot=0,avg=0;
	for(int i=0;i<4;i++)
		{
			tot=tot+marks[0];
		}
	avg=(int)(tot*100/400);
	if(avg>90)
		{
	 		grade="A+";
		}
	else if(avg<90&&avg>80)
		{
	 		grade="A";
		}
	else if(avg<80&&avg>70)
		{
	 		grade="B";
		}
	else if(avg<70&&avg>55)
		{
	 		grade="c";
		}
	else
		{
			 grade="D";
		}
	}

	void display()
	{
	 System.out.println("Details are-----------------------");
	 System.out.println("id:\t"+id);
	 System.out.println("name:\t"+name);
	 System.out.println("age:\t"+age);
	 System.out.println("grade:\t"+grade);
	}
}
class StudentDetails{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of students"); 
		int n=sc.nextInt();
		
		Student s[]=new Student[n];
		for(int i=0;i<n;i++)
		{
			s[i]=new Student();
			s[i].read();
		}
		for(int i=0;i<n;i++)
		{
			s[i].calgrade();

		}
		for(int i=0;i<n;i++)
		{
			s[i].display();

		}


}
}