package com.te.learn.hashsetdemo;

import java.util.HashSet;



public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Student> set=new HashSet<Student>();
		set.add(new Student(1,"aa",11));
		set.add(new Student(2,"aa",2));
		set.add(new Student(1,"aa",11));
		
		for (Student in:set) {
			System.out.println(in+"");
		}
	}

}
