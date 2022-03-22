package com.onebill.thread;

public class TDemo {
	public static void main(String[] args) {
		DemoThread mr=new DemoThread();
		Thread th=new Thread();
		th.setName("th1");
		th.start();
		Thread th2=new Thread(mr);
		th2.setName("th2");
		th2.start();
	}

}
