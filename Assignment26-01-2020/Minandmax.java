package com;

import java.util.Arrays;
import java.util.Scanner;

public class Minandmax{
public static void main(String args[])
		{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter integer count:");
	int in=input.nextInt();
	System.out.println("Enter array integers:");
	int[] a=new int[in];
	for(int i=0;i<in;i++)
		a[i]=input.nextInt();
	Arrays.sort(a);
	System.out.println("min:"+a[0]);
	System.out.println("max:"+a[a.length-1]);
		}
}
