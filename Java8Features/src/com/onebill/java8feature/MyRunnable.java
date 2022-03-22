package com.onebill.java8feature;

public interface MyRunnable {
	void run();
	

}
class ImplRun implements MyRunnable{

	@Override
	public void run() {
System.out.println("implemented by ImplRun class");

	}
	
}

public class LambdaExpression{
	public static void main(String[] args) {
		MyRunnable my=new  MyRunnable();
		public void run() {
			System.out.println("implemnetesd by someone");
		}
	};
	 
	 MyRunnable mr=()->System.out.println("run() implemented by lambda expression");
	
}
