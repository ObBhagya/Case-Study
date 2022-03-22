package com.onebill.java.adavance;

public class MyArrayList {
	
	int []arr=new int[5];
	int index=0;
	
	public void add(int no) {
		if(index<arr.length) {
			
			System.out.println(no+"added at index"+index);
		
		arr[index++]=no;
		
	}
		else {
			
			int [] newArr=new int [arr.length*2];
		for (int i=0;i<arr.length;i++) {
			arr[i]=newArr[i];
			
		}
		
		
		System.out.println(no+"added at index"+index);
		newArr[index++]=no;
		arr=newArr;
		}
	}
}

		
	
	
	
	
