package com.onebill.thread;

public class DemoThread implements Runnable {

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		for(int i=0;i<=100;i++) {
			System.out.println(name+"is downloading file"+i+"%");
		}
		
	}
	
	

}
