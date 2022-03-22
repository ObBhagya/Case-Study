package com.te.leran.treMp;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreMpDemo {

	public static void main(String[] args) {
		
		Comparator comparator=(Object o1,Object o2) -> {
			Integer i1=(Integer) o1;
			Integer i2=(Integer) o2;
			
			if(i1>i2)
				return 1;
			else if (i1<i2)
				return -1;
			return 0;
			
			
		};
		
		
		
		
		
		TreeMap<Integer, Student> treemap=new TreeMap<Integer,Student>(comparator);
		treemap.put(1, new Student (1,"aa", 021));
		treemap.put(12, new Student(2,"aa", 024));
		treemap.put(3, new Student(3,"aa", 021));
		
		for (Entry<Integer, Student> entry : treemap.entrySet()) {
			System.out.println("key-" + entry.getKey()+"-value-" +entry.getValue());
		}
		
		
		
	}
	
	
	
	
	
}
