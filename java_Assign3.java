import java.util.Scanner;
class Details{
int []id;
String []name;
int []sal;
String []desg;
Scanner sc=new Scanner(System.in);
void size(int x)
{
id=new int[x];
name=new String[x];
sal=new int[x];
desg=new String[x];
}
void read(int n)
{
System.out.println("enter details");
for(int i=0;i<n;i++)
{
System.out.println("enter details of id");
id[i]=sc.nextInt();
sc.nextLine();
System.out.println("enter details of name");
name[i]=sc.nextLine();
System.out.println("enter details of salary");
sal[i]=sc.nextInt();
sc.nextLine();
System.out.println("enter details of designation");
desg[i]=sc.nextLine();
}
}

void calSal(int n)
{
for(int i=0;i<n;i++)
{
sal[i]=sal[i]+(int)(((sal[i]*.1)+(sal[i]*.07))-(sal[i]*.05));
}
}

void bonus(int n)
{
for(int i=0;i<n;i++)
{
if(desg[i].equals("manager"))
{
sal[i]=sal[i]+(int)(sal[i]*.15);
}
else if(desg[i].equals("developer"))
{
sal[i]=sal[i]+(int)(sal[i]*.1);
}
else
{
sal[i]=sal[i]+(int)(sal[i]*.05);
}
}
}
void display(int n)
{
System.out.println("-------------Employee----Details--------------");
System.out.println("id\t\tname\t\tsalary\t\tdesignation");
for(int i=0;i<n;i++)
{
System.out.println(id[i]+"\t\t"+name[i]+"\t\t"+sal[i]+"\t\t"+desg[i]);
}
}
}
class Assign2{
public static void main(String args[])
{
Details d1=new Details();
Scanner sc=new Scanner(System.in);
System.out.println("Enter size");
int n=sc.nextInt();
d1.size(n);
d1.read(n);
d1.calSal(n);
d1.bonus(n);
d1.display(n);


}
}