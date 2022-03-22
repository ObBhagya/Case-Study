package com.onebill.polymorphisim;

public class Cmain {
	public static void main (String args[]) {
		
		 Compiletime ct=new Compiletime();
		System.out.println(ct.sum(1,1)); 
		System.out.println(ct.sum(2, 2));
		System.out.println(ct.sum(3, 3,3));
	}

}
