import java.util.Scanner;

class Assign1{
public static void main(String args[]){
System.out.println("enter no of records you want to enter");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []id=new int[n];
String []name=new String[n];
int []sal=new int[n];
String []desg=new String[n];
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
    for(int i=0;i<n;i++)
    {
    sal[i]=sal[i]+(int)(((sal[i]*.1)+(sal[i]*.07))-(sal[i]*.05));
    }
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
    System.out.println("-------------Employee----Details--------------");
    System.out.println("id\t\tname\t\tsalary\t\tdesignation");
    for(int i=0;i<n;i++)
    {
    System.out.println(id[i]+"\t\t"+name[i]+"\t\t"+sal[i]+"\t\t"+desg[i]);
    }
}
}