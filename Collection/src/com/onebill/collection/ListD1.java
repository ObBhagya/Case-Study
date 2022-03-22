package com.onebill.collection;

import java.util.List;
import java.util.Stack;

public class ListD1 {
	
	public static void main(String[] args) {
		List list=new Stack();
		list.add("kaveri");
		list.add("kavaya");
		list.add("kartik");
		list.add("Ganesh");
		
		//advantage of Arraylist
	System.out.println(list.get(0));	
    System.out.println(list.get(3));
    
    //disadvantage
    System.out.println(list);
    list.add(1,"Akashay");
    System.out.println(list);

	
	
	
	}
}
