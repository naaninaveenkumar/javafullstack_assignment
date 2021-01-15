import java.util.Scanner;
class Demo1{
public static void main(String args[])
{
int var,count=0,flag=0,flag1=0,flag2=0,count1=0,per;
int ans[]= new int[20];
do{
System.out.println("welcome for the examination");
System.out.println("subjects for exam are 1.english 2.maths 3.gk \n choose one");
Scanner sc=new Scanner(System.in);
var=sc.nextInt();
switch(var){
case 1: if(flag==1)
	{ System.out.println("already attempted");}
	else{
	System.out.println("this is english");
	System.out.println("how many alphabets are there in english");
	int a=sc.nextInt();
	if(a==26)
	{ 
	ans[0]=1;
	}
	
	System.out.println("how many vowels are there");
	int b=sc.nextInt();
	if(b==5)
	{ 
	ans[1]=1;
	}
	
	System.out.println("how many consonents are there");
	int c=sc.nextInt();
	if(c==21)
	{ 
	ans[2]=1;
	}
	
        count++;
        flag=1;
	}
        break;       
case 2: if(flag1==1)
	{ System.out.println("already attempted");}
	else{
	System.out.println("this is maths");
	System.out.println("how many even numbers from 1 to 10");
	int a=sc.nextInt();
	if(a==5)
	{ 
	ans[3]=1;
	}
	
	System.out.println("how many odd numbers from 1 to 10");
	int b=sc.nextInt();
	if(b==5)
	{ 
	ans[4]=1;
	}
	
	System.out.println("how many prime numbers in 1 to 10");
	int c=sc.nextInt();
	if(c==4)
	{ 
	ans[5]=1;
	}
	
        count++;
	flag1=1;
	}
        break;

case 3: if(flag2==1)
	{ System.out.println("already attempted");}
	else{
	System.out.println("this is gk");
	System.out.println("how many teeth does a human adult has");
	int a=sc.nextInt();
	if(a==32)
	{ 
	ans[6]=1;
	}
	
	System.out.println("how many bones are there for human body");
	int b=sc.nextInt();
	if(b==206)
	{ 
	ans[7]=1;
	}
	
	System.out.println("how many sense organs are there");
	int c=sc.nextInt();
	if(c==5)
	{ 
	ans[8]=1;
	}
	
        count++;
	flag2=1;
	}
        break;

default: if(flag==0)	
		{
		System.out.println("complete english,maths and gk exam");
		}
	else if(flag1==0)	
		{
		System.out.println("complete maths and gkexam");
		}
	else if(flag2==0)	
		{
		System.out.println("complete gk exam");
		}
	else
	{
         System.out.println("complete all the exams");
	}
	break;
}
}while(count<3);
System.out.println("the result is");
for(int i=0;i<ans.length;i++)
{
	//count1=0;
	if(ans[i]==1)
	{
		count1++;
	}
}
per=(count1*100)/9;
if(per>70 &&per<89)
{
	System.out.println(per+10+"Is your pass percentage");
}
else if(per>90 && per<100)
{
	System.out.println("selected for gate exam ur percentage is"+per);
}
else if(per<70 && per>30)
{
	 System.out.println("try again");
}

}
}