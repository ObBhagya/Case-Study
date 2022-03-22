package com.onebill.thread;

public class ThreadDemo2 {

	public static void main(String[] args) {
    MyThread mth1=new MyThread();
    mth1.setName("mth1");
    
    
    MyThread mth2=new MyThread();
    mth2.setName("mth2");
    
    mth1.start();
    mth2.start();

	}

}
