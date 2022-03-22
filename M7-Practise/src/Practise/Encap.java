package Practise;

public class Encap {
	
	private int humanage;
	private String humaname;
	private int humanweight;
	
	public Encap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Encap(int humanage, String humaname, int humanweight) {
		super();
		this.humanage = humanage;
		this.humaname = humaname;
		this.humanweight = humanweight;
	}

	
	
	
	public int getHumanage() {
		return humanage;
	}

	public void setHumanage(int humanage) {
		this.humanage = humanage;
	}

	public String getHumaname() {
		return humaname;
	}

	public void setHumaname(String humaname) {
		this.humaname = humaname;
	}

	public int getHumanweight() {
		return humanweight;
	}

	public void setHumanweight(int humanweight) {
		this.humanweight = humanweight;
	}

	@Override
	public String toString() {
		return "Encap [humanage=" + humanage + ", humaname=" + humaname + ", humanweight=" + humanweight + "]";
	}
	
	
	
}
