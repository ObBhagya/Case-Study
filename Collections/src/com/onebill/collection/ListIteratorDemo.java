package com.onebill.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		List list = new ArrayList();

		list.add("aa");
		list.add("bb");
		list.add("cc");

	ListIterator lit=list.listIterator();
	while(lit.hasNext()) {
		System.out.println("Next item "+lit.next());
		
	}
	
	ListIterator lit1=list.listIterator();
	while(lit1.hasPrevious()) {
		System.out.println("previous "+lit1.next());
	}
	
	ListIterator lit3=list.listIterator(list.size());
	//while(lit.hasNext()) {
		System.out.println("list size "+list.size());

}
}
