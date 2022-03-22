package com.onebill.arrays;

public class Test {

	
	public static void main (String args[]) {
		int a []= {123,343,345,32,122};
		//int samllest = a[0];
		int temp=a[0];
		for (int i=0;i<a.length;i++)
			
		{
			if(temp>a[i]) 
			{
				temp=a[i];
				
			}
		}
		System.out.println(temp);
	}
}
	
	

