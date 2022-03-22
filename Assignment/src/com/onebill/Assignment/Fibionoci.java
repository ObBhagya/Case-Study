package com.onebill.Assignment;

import java.util.Scanner;

public class Fibionoci {
	public static void main(String[] args) {
		
	
	int n1,n2,n3;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("entr value");
	n1=0;n2=1;	
	int n=sc.nextInt();
	System.out.print(n1+" "+n2);
	
	for(int i=2;i<n;i++)
	{
		n3=n1+n2;
   n1=n2;
   n2=n3;
   
	
		System.out.print(" "+n3);   
	
	}
	
	}
	
	

}
