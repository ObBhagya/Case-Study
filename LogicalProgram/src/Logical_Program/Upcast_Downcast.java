package Logical_Program;

class Parent{
	
	public void Data() {
		System.out.println("Parent data");
		
	}
	
}

 class Child extends Parent{
	public void Data() {
		System.out.println("Child data");
	}
}

public class Upcast_Downcast {

	public static void main(String[] args) {
		
		Parent p=(Parent) new Child();//upcasting
		
		Parent p1=new Child();//downcasting
		
		p1.Data();
		
		p.Data();
		
		
		
	}

}
