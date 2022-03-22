package com.onebill.java.adavance;

public class Employee {

	
	private int id;
	private String name;
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	
	 


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+""+id;
	}




	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e1= this;
		Employee e2= (Employee)obj;
		return e1.id==e2.id;
		
		
	}




	@Override
	protected void finalize() throws Throwable {
		System.out.println("CG collecting de-generate object");
	}
	
	public Employee(int id,String name) {
		super();
		this.id=id;
		this.name=name;
		
	}
	
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id=id;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	
	
}

