package com.onebill.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class Demo {
	public static void main(String args[]) {
		Collection c=new ArrayList();
		c.add("string");
		c.add(10);
		c.add('a');
		c.add(10.10);
		c.add(true);
		c.add(null);
		
		Iterator iterator=c.iterator();
		
		ArrayList list =new ArrayList();
		
		list.add(20);
		list.add("Anyrthing");
		System.out.println(c.contains(20));
		list.clear();
		c.addAll(list);
		System.out.println(c);
    System.out.println(c.size());
    System.out.println("The list container"+list.isEmpty());
    System.out.println("The container"+c.isEmpty());
    
    
		
	}
	

}
