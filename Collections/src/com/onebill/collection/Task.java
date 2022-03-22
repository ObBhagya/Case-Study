package com.onebill.collection;

public class Task implements Comparable {

	 private int	stu_id;
	 private String name;
	 private int marks;
	 
	public Task(int stu_id, String name, int marks) {
		super();
		this.stu_id = stu_id;
		this.name = name;
		this.marks = marks;
	}
	// private int salary;
	
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Task [stu_id=" + stu_id + ", name=" + name + ", marks=" + marks + "]";
	}
	 
	 
	public int compareTo(Object o) {
		Task e=(Task)o;
		return this.stu_id-e.stu_id;
	}

}
