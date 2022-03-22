package com.onebill.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection {
	public static void main(String[] args) {
		
		Set set=new HashSet();
	set.add(null);
		set.add("abc");
		set.add("efg");
		set.add("aaa");
		set.add("zzz");
		System.out.println(set);
	
		
		
	
	
	
	Set setlnk=new LinkedHashSet();
	set.add(null);
	
	setlnk.add("qq");
	setlnk.add("ww");
	setlnk.add("ee");
	setlnk.add("rr");
	System.out.println(setlnk);
	
	Set settr=new TreeSet();
	settr.add("tt");
	settr.add("yy");
	settr.add("uu");
	settr.add("pp");
	//set.add(null);
	System.out.println(settr);
			
		

}
}
