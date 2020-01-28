package com.cts;

import java.util.Scanner;

public class NameandYear{
public static void main(String args[])
{

		String name;
		String year;
         Scanner sc=new Scanner(System.in);
         while(true)
			{
				int ntemp=0;
				int yeartemp=0;
				System.out.println("Enter your name:");
				name =sc.next();
				System.out.println("Enter your graduation:");
				year=sc.next();
				
				if(year.matches("[0-9]+"))
				 {
					yeartemp = 0;
				 }
				else {
					System.out.println("Enter correct year");
					yeartemp = 1;
				}
				 
				 for (int i = 0; i < name.length(); i++) {
						if (!name.matches("[0-9]+")) {
							
						}
						else {
							ntemp=1;
							System.out.println("Enter correct name");
							break;
						}
				 }
				 if(ntemp==0 && yeartemp==0) {
					 break;
				 }
				}	
			
			System.out.println("Name:"+name+"\nYearofgraduation:"+year);
		 
	     
	}

	}

