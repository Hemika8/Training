package com.cts.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Vector;

public class Collectionexample {
public static void main()
{
Vector<Integer> ve=new Vector<Integer>();
ve.add(4);
ve.add(4);
ve.add(4);
ve.add(4);
ve.add(4);//it will increase memory 100% which leads to memory leakage.Insertion is slow
for(int i:ve)
{
	System.out.println(i);
}
List<Integer> li=new LinkedList();
li.add(4);//performance while inserting data is good.But Acceesing the element will effect the performance
li.add(4);
li.add(4);
li.add(4);
li.add(4);
Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
ht.put(101," ajay"); 
ht.put(101,"Vijay"); 
ht.put(102,"Ravi"); 
ht.put(103,"Rahul"); 
System.out.println("Hash table"); 
for (Entry<Integer, String> m:ht.entrySet()) { 
    System.out.println(m.getKey()+" "+m.getValue()); 
} 
HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
hm.put(100,"Amit"); 
hm.put(104,"Amit");  // hash map allows duplicate values 
hm.put(101,"Vijay"); //hasmap allows one null key and any number of null values
hm.put(102,"Rahul"); 
System.out.println("Hash map"); 
for (Entry<Integer, String> m:hm.entrySet()) { 
    System.out.println(m.getKey()+" "+m.getValue()); 
}
}
}