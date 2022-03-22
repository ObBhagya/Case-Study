package com.onebill.hasarelation;

public class Operatings {
	String bran;
	double versio;
	double bit;
	public Operatings(String bran, double versio, double bit) {
		super();
		this.bran = bran;
		this.versio = versio;
		this.bit = bit;
	}
	@Override
	public String toString() {
		return "Operatings [bran=" + bran + ", versio=" + versio + ", bit=" + bit + "]";
	}
	

}
