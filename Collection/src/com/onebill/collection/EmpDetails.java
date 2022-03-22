package com.onebill.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmpDetails {

	public static void main(String[] args) {
		//Employee emp1=new Employee(1,"aa",44,122222);
		
		//System.out.println(""+emp(1);
		
		/*Set set=new TreeSet();
		set.add(new Employee(1,"aa",22,10000));
		set.add(new Employee(2,"bb",22,10000));
		set.add(new Employee(3,"cc",22,10000));
		set.add(new Employee(1,"aa",22,10000));*/
		
		
		Set set=new TreeSet(new DescId());
		set.add(new Employee(1,"aa",22,10000));
		set.add(new Employee(2,"bb",22,10000));
		set.add(new Employee(3,"cc",22,10000));
		set.add(new Employee(1,"aa",22,10000));
		
		System.out.println(set);
		
		
		
		
		
		

	}

}
