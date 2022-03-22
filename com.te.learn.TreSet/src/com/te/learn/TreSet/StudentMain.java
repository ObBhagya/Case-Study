package com.te.learn.TreSet;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentMain {

	public static void main(String[] args) {
		
		//comparable
		
		TreeSet <Student> treeSet=new TreeSet<Student>();
		treeSet.add(new Student(1,"aa",22));
		treeSet.add(new Student(2,"bb",23));
		treeSet.add(new Student(3,"cc",21));
		
		
		for(Student s:treeSet) {
			System.out.println(s);
			
			//compator
			
			
			Comparator byId=(Object o1,Object o2)->{
			
			Student s1=(Student) o1;
			Student s2=(Student) o2;
			
			if(s1.getSage()<s2.getSage())
				return 1;
			
			else if (s2.getSage()<s2.getSage())
				return -1;
			
			return 0;
			
			};
			
			
			TreeSet <Student>tree=new TreeSet<Student>();
			tree.add(new Student(1,"aa",22));
			tree.add(new Student(2,"bb",23));
			tree.add(new Student(3,"cc",21));
			
			for(Student st:tree) {
				System.out.println(st);
			}
			
			
		}
	}

}
