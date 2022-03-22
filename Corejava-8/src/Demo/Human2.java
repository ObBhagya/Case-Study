package Demo;

public class Human2 {
	private String humanName;
	private int humanAge;
	private int humanHeight;
	private double humanWeight;

	public Human2() {
		super();
	}

	public Human2(String humanName, int humanAge, int humanHeight, double humanWeight) {
		super();
		this.humanName = humanName;
		this.humanAge = humanAge;
		this.humanHeight = humanHeight;
		this.humanWeight = humanWeight;
	}

	public String getHumanName() {
		return humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public int getHumanAge() {
		return humanAge;
	}

	public void setHumanAge(int humanAge) {
		if (humanAge < 0) {
			System.out.println("age entered wrong");
		} else {
			this.humanAge = humanAge;
		}
	}

	public int getHumanHeight() {

		return humanHeight;
	}

	public void setHumanHeight(int humanHeight) {
		if (humanHeight < 30) {
			System.out.println("weight anetred wrong");
		} else {
			this.humanHeight = humanHeight;
		}
	}

	public double getHumanWeight() {
		return humanWeight;
	}

	public void setHumanWeight(double humanWeight) {
		this.humanWeight = humanWeight;
		
	}

//	@Override
//	public String toString() {
//		return "Addres [humanName=" + humanName + ", humanAge=" + humanAge + ", humanHeight=" + humanHeight
//				+ ", humanWeight=" + humanWeight + "]";
//	}

	
	
	    
}
