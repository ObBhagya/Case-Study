package com.ob.asignment;

public class Fibonaci {

	public static void main(String[] args) {
		int n1=0,n2=1,i,count=5,n3;
		
		//printing first two numbers
		System.out.print(n1+ "" +n2);
		
		for(i=2;i<count;i++) {
			
			n3=n1+n2;
			
			System.out.print(""+n3);
			
			n1=n2;
			n2=n3;
			
		}
			
		
		
		
		
	}

}
