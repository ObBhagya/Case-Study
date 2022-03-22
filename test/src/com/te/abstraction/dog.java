package com.te.abstraction;

public abstract class dog {
	double weight;
	int nails;
	String breed;
	
public dog(double weight,int nails,String breed) {
	this.weight=weight;
	this.nails=nails;
	this.breed=breed;
}
	
	abstract void bark();
	abstract void bite();
	abstract void eat();
	 void poop()
	{
		System.out.println("poop");
		
	}

}
