package com.onebill.thread;

public class BookMyShow {

	int total_ticket;
	
	public void book_my_ticket(int no) {
		String name=Thread.currentThread().getName();
		if(no>=total_ticket) {
			total_ticket-=no;
			
			System.out.println(name+ "booked sucessfully");
		}
		
		else {
			System.out.println(name+"tickets not available");
		}
	}
	
	
	
	

}
