package com.cts.pms;

import java.util.Scanner;

public class Togglecase {

			public static void main(String[] args) {
				String str = null;
				String str2 = "";
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter string:");
				str = sc.nextLine();
				for(int i=0;i<str.length(); i++) {
					if(i%2 == 0) {
						Character.toLowerCase(str.charAt(i));
						str2+=Character.toLowerCase(str.charAt(i));
					}
					else {
						Character.toUpperCase(str.charAt(i));
						str2+=Character.toUpperCase(str.charAt(i));
					}
				}
				System.out.println(""+str2);
			}
  }