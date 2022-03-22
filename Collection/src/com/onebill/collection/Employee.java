package com.onebill.collection;

public class Employee implements Comparable {

 private int	emp_id;
 private String name;
 private int age;
 private int salary;

 public Employee(int emp_id, String name, int age, int salary) {
	super();
	this.emp_id = emp_id;
	this.name = name;
	this.age = age;
	this.salary = salary;
	
	
	
	
	
}
 public Employee() {
	 
 }
 
 

 @Override
public boolean equals(Object arg0) {
	// TODO Auto-generated method stub
	return super.equals(arg0);
}
@Override
public int hashCode() {
	return emp_id;
	}
public int getEmp_id() {
	return emp_id;
}

 public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [emp_id=" + emp_id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
}
public int compareTo(Object o) {
	Employee e=(Employee)o;
	return this.emp_id-e.emp_id;
}

 
 
}
