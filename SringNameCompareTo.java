package Assignment;
import java.util.Scanner;

public class SringNameCompareTo {
		public static void main(String args[]) {
			String name[];
			String temp;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter no of names");
			int n=sc.nextInt();
			name=new String[n+1];
			System.out.println("enter "+n+" names");
			for(int i=0;i<n+1;i++)
			{
				name[i]=sc.nextLine();
				
			}
			
			for(int i=0;i<n+1;i++)
			{
				for(int j=i+1;j<n+1;j++)
				{
					if(name[i].compareTo(name[j])>0)
					{
						temp=name[i];
						name[i]=name[j];
						name[j]=temp;
					}
				}
			}
			for(int i=0;i<n+1;i++)
			{
				System.out.println(name[i]);
			}
			
		}

	}

