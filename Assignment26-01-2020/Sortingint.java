package com;

import java.util.*;

public class Sortingint{
public static void main(String args[])
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter integer count:");
	int in=input.nextInt();
	System.out.println("Enter array integers:");
	int[] a=new int[in];
	for(int i=0;i<in;i++)
		a[i]=input.nextInt();
	Arrays.sort(a);;
	System.out.print(""+Arrays.toString(a));
}
}
