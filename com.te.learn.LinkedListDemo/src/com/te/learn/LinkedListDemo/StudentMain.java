package com.te.learn.LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class StudentMain {

	public static void main(String[] args) {
		
		
		LinkedList list=new LinkedList();
		list.add(new StudentDetails (1,"aa",16));
		list.add(new StudentDetails(2,"bb",16));
		list.add(new StudentDetails(2,"cc",16));
		
		
		System.out.println("linked list");
		
		for (Object object:list) {
			System.out.println("linked list"+list);
		}
		
		for(int i=0;i<list.size();i++)
			System.out.println(list);
		
		
		System.out.println("====");
		
		Iterator iterator=list.iterator();
			while(iterator.hasNext()) {
				
				System.out.println(iterator.next());
				
			}
			
			System.out.println("===");
			ListIterator listIterator=list.iterator();
			while(iterator.next()) {
			System.out.println(iterator.next());
			}
			
		
	}

}
