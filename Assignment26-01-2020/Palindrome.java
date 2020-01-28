package com.cts.pms;
import java.util.*;
public class Palindrome {
public static void main(String args[])
{
int n,i,pal=0;
Scanner input=new Scanner(System.in);
n=input.nextInt();
int t=n;
while(n>0)
{
	i=n%10;
	pal=pal+i;
	n=n/10;
}
if(pal==t)
System.out.println("palindrome");
else
	System.out.println("Not Palindrome");
}
}
