package com.onebill.thread;

public class CustThread extends Thread{
Resource res;

public CustThread(Resource res) {
	this.res=res;
	
	
	
}

@Override
public void run() {
	res.task();
}


}
