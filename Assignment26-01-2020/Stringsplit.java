package com.cts.pms;
import java.util.*;
public class Stringinput {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string to split:");
	String string=sc.nextLine();
	String[] str=string.split(" ");
	for(int i=0;i<str.length;i++)
	System.out.println(str[i]);
}
}
