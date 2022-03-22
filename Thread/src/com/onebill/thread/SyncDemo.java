package com.onebill.thread;

public class SyncDemo {

	public static void main(String[] args) {
		Resource res=new Resource ();
		CustThread th1=new CustThread(res);
		th1.setName("th1");
		
		
		CustThread th2=new CustThread(res);
		th2.setName("th2");
		
		th1.start();
		th2.start(); 
	
	}

}
