package com.cts.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambdaexpression {
	public static void main(String args[])
	{ List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
	public static void filter(List names, Predicate condition)
	{ for(String name:languages)
	{ if(condition.test(languages)) 
	{ System.out.println(name + " ");
	}
	}
	}
	System.out.println("Languages which starts with J :"); 
	filter(languages, (str)->str.startsWith("J")); 
	System.out.println("Languages which ends with a ");
	filter(languages, (str)->str.endsWith("a")); 
	System.out.println("Print all languages :");
	filter(languages, (str)->true);
	System.out.println("Print no language : ");
	filter(languages, (str)->false); 
	System.out.println("Print language whose length greater than 4:");
	filter(languages, (str)->str.length() > 4); } 
	
	

}
}
