package com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileAssignment {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr;
		FileWriter fw;
		int s;
		char ch =' ';
		char ch1;
		int var;
		do {
			System.out.println("1.Information in upper case in target file\n2.Information in lower case in targer file\n3.Sentence first letter in upper case in target file\n4.display no of characters in file\n5.Display number of words present in file\n6.exit");;
			System.out.println("choose one option");
			Scanner sc =new Scanner(System.in);
			var=sc.nextInt();
			switch(var)
			{
			case 1: fr=new FileReader("D:\\abc.txt");
				    fw=new FileWriter("D:\\cba.txt");
					while((s=fr.read())!=-1)
					{
						ch=(char)s;
						ch1=Character.toUpperCase(ch);
						fw.write(ch1);
					}
					
					fr.close();
					fw.close();
					System.out.println("File copied in upper case");
					break;
			case 2: fr=new FileReader("D:\\abc.txt");
				    fw=new FileWriter("D:\\cba1.txt");
					while((s=fr.read())!=-1)
					{
						ch=(char)s;
						ch1=Character.toLowerCase(ch);
						fw.write(ch1);
					}
					
					fr.close();
					fw.close();
					System.out.println("File copied in lower case");
					break;
			case 3: int ct=0;
					int flag=0;
					fr=new FileReader("D:\\abc.txt");
				    fw=new FileWriter("D:\\cba2.txt");
					while((s=fr.read())!=-1)
					{
						ct++;
						if(ct==1)
						{
							ch=(char)s;
							ch1=Character.toUpperCase(ch);
							fw.write(ch1);
						}
						else if(s==32&&ch=='.')
						{
							flag=1;
							ch=(char)s;
							ch1=Character.toLowerCase(ch);
							fw.write(ch1);
							
						}
						else if(flag==1)
						{
							flag=0;
							ch=(char)s;
							ch1=Character.toUpperCase(ch);
							fw.write(ch1);
						}
						else {
						ch=(char)s;
						ch1=Character.toLowerCase(ch);
						fw.write(ch1);
						}
					}
					
					fr.close();
					fw.close();
					System.out.println("File copied with sentence first letter in upper cae");
					break;
					
			case 4: int count=0;
					fr=new FileReader("D:\\abc.txt");
					while((s=fr.read())!=-1)
					{
						if(s!=32)
						{
							count++;
						}
						
					
					}			
					fr.close();
					System.out.println("no of characters in a file excluding spaces are "+count);
					break;
			case 5: int count1=0;
					fr=new FileReader("D:\\abc.txt");
					while((s=fr.read())!=-1)
					{
						if(s==32)
						{
						count1++;
						}
					
					}			
					fr.close();
					count1++;
					System.out.println("no of words in a file are "+count1);
					break;
			case 6: System.exit(0);
			default:System.out.println("enter valid option");
			}
		}while(var<=6);
		

	}

}
