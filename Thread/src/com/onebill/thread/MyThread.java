package com.onebill.thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		
		String name=Thread.currentThread().getName();
		for(int i=1;i<=100;i++) {
			System.out.println(name+"is dowloading"+i+"%");
			
		}
		
	}
	
}


