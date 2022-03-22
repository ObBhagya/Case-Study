package com.onebill.java8feature;

public interface Demo {
	void m1();
	void m2();
	void m3();
	//void m4();
	default void m4() {
		System.out.println("myinterface implements defaulut logic");
		
		
	}
	
}

class Rakesh implements Demo{

	@Override
	public void m1() {
		System.out.println("rakesh m1");
	}

	@Override
	public void m2() {
System.out.println("rakesh m2");		
	}

	@Override
	public void m3() {
System.out.println("rakesh m3");		
	}
	
	class Akashay implements Demo{

		@Override
		public void m1() {
			System.out.println("akashay m1");
			
		}

		@Override
		public void m2() {
			System.out.println("m2");
			
		}

		@Override
		public void m3() {
			System.out.println("akashay m3");
			
		}
		
	}
	
	public class JavaFeatures{
		public static void main(String[] args) {
			
		}
	}
	
}
