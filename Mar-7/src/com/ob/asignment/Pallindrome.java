package com.ob.asignment;

public class Pallindrome {

	public static void main(String[] args) {
		
		int n=121;
		
		int rem,rev=0,temp;
		temp=n;
		
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
	   
		if(temp==rev)
			System.out.println("its pallindrome");
		else
			System.out.println("its not a pallindrome");
	
	
	}
	
	

}
