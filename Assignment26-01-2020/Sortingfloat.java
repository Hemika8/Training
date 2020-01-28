package com;
import java.util.*;
public class Sortingfloat{
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter float array size:");
	float n=in.nextFloat();
	System.out.println("Enter float values to sort:");
	float[] a=new float[(int) n];
	for(int i=0;i<n;i++)
		a[i]=in.nextFloat();
	Arrays.sort(a);
	System.out.println(""+Arrays.toString(a));
}
}
