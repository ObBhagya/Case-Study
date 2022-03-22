package Instof;



class parent {
	int a=10;
	public static void test() {
		System.out.println("parent method");
	}
	public void test1() {
		System.out.println("non-static parent");
	}
	
}

class child extends parent{
	int b=20;
	public static void test() {
		System.out.println("child method");
		}
	public void test1() {
		System.out.println("non static-child");
	}
}

public class Shadowing {

	public static void main(String[] args) {
		
	parent p=new child();//parent non-static void method 
	
	//non-static method will override
	
	child c=(child) p;//child non-static void method
	
	c.test(); 
	p.test();
	
	c.test1();
	p.test1();
	
	}

}
