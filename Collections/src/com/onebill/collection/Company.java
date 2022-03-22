package com.onebill.collection;

import java.util.ArrayList;

public class Company {
public static void main(String[] args) {
	ArrayList<Employee> arrayList=new ArrayList();
	Employee employee=new Employee(1,"Vivek",100000);
	arrayList.add(employee);
	arrayList.add(new Employee(2,"raj",20000));
	arrayList.add(new Employee(3,"hucc",1111));
	arrayList.add(employee);
	arrayList.add(2,employee);
	arrayList.add(2,new Employee(10,"messi",1111100));
	for(Employee e:arrayList) {
		System.out.println(e);
	}
	
}
}
