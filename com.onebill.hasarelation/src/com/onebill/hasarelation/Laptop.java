package com.onebill.hasarelation;

public class Laptop {
double cost;
private Battery battery;
private Operatings os;
private HardDisk harddisk;
private Processor processor;

public Laptop(double cost, Battery battery, Operatings os, HardDisk harddisk, Processor processor) {
	super();
	this.cost = cost;
	this.battery = battery;
	this.os = os;
	this.harddisk = harddisk;
	this.processor = processor;
}

@Override
public String toString() {
	return "Laptop [cost=" + cost + ", battery=" + battery + ", os=" + os + ", harddisk=" + harddisk + ", processor="
			+ processor + "]";
}


//public Laptop(double cost,Battery)
}
