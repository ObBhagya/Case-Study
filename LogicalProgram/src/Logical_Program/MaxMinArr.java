package Logical_Program;

public class MaxMinArr {
	
	public int max(int []arr) {
		int max=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
			
		}
		
		return max;
	}
	
	
	
	public int min (int []arr) {
		
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}	
		
	}
		return min;
	}
	
	

	public static void main(String[] args) {
		int [] myarr= {10,11,6,9};
		
		MaxMinArr aa=new MaxMinArr();
		System.out.println("max value-"+aa.max(myarr));
		System.out.println("min value-"+aa.min(myarr));
	}

}
