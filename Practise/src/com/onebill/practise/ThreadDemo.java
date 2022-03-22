package com.onebill.practise;
import java.util.*;

public class ThreadDemo {

	public static void main(String[] args) {
  
		Runnable mr=()->{//example of lambda expression
			
		
		String name=Thread.currnetThread().getName();
		for(int i=1;i<100;i++) {
			System.out.println(name +"is downloading file"+i+"%");
		}
		
	};
		
	
	
	Thread th=new Thread(mr);
	th.setName("th1");
	th.start();
	
	}

}
