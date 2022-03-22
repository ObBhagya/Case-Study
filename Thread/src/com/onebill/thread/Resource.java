package com.onebill.thread;

public class Resource {

	synchronized void task() {
	for(int i=1;i<=5;i++) {
		System.out.println(Thread.currentThread().getName()+"executing "+i);
		
	}
	}
}
