package com.onebill.arrays;

public class Starting {
	public static void main(String args[]) {
		int a[]= {2,34,11,44,55};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
	
	for(int x:a)
	{
	System.out.println(x);
	}
	
	
	
	
	
	}	
}
