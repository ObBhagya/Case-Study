package com.onebill.java.adavance;

public class ObArr {
	
		
		Object []arr=new Object[5];
		int index=0;
		
		public void add(Object no) {
			if(index<arr.length) {
				
				System.out.println(no+ "added at index" +index);
			
			arr[index++]=no;
			
		}
			else {
				
				Object [] newArr=new Object [arr.length*2];
			for (int i=0;i<arr.length;i++) {
				arr[i]=newArr[i];
				
			}
			
			
			System.out.println(no+ "added at index" +index);
			newArr[index++]=no;
			arr=newArr;
			}
		}
	}

			
		
		
		
		


