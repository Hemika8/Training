package com.cts.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamapi {
public static void main(String args[])
{
	List<Integer> number = Arrays.asList(2,3,4,5);	
	List<Integer> result = number.stream().filter(s->s.equals(0)).
            collect(Collectors.toList());// by using streamapi we can perform easy iteration and prints the re
System.out.println(result); 
List<Integer> show = 
number.stream().sorted().collect(Collectors.toList()); 
System.out.println(show); 

}
}
