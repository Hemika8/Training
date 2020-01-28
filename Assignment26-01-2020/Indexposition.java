package com;

import java.util.*; 

public class Indexposition{ 
	public static void main(String[] args) 
	{ 
		List<Integer> list = new ArrayList<Integer>(5); 
		list.add(23); 
		list.add(3); 
		list.add(445); 
		list.add(444); 
		list.add(234); 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index position");
		int index=sc.nextInt(); 
		System.out.println("Before deleting the element: " + list); 
		if(index<list.size())
		{
		list.remove(index);
		System.out.println("Aftre deleting the element: " + list);
		}
		else
		{
			System.out.println("Index position is out of bounds");
		}
		 
	} 
} 
