package com.onebill.collection;

public class Laptop {
	private double prie;
	private int ram;
	private int hdd;
	

	public Laptop(double prie, int ram, int hdd) {
		super();
		this.prie = prie;
		this.ram = ram;
		this.hdd = hdd;
	}

	@Override
	public String toString() {
		return "Laptop [prie=" + prie + ", ram=" + ram + ", hdd=" + hdd + "]";
	}

	public double getPrie() {
		return prie;
	}

	public void setPrie(double prie) {
		this.prie = prie;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hdd;
		long temp;
		temp = Double.doubleToLongBits(prie);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ram;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (hdd != other.hdd)
			return false;
		if (Double.doubleToLongBits(prie) != Double.doubleToLongBits(other.prie))
			return false;
		if (ram != other.ram)
			return false;
		return true;
	}

}
