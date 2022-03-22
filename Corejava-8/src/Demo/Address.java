package Demo;

public class Address {

	
	private int  hno;
	private String streatNam;
	private String city;
	private String state;
	
	public Address(int hno, String streatNam, String city, String state) {
		super();
		this.hno = hno;
		this.streatNam = streatNam;
		this.city = city;
		this.state = state;
		
		
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getStreatNam() {
		return streatNam;
	}

	public void setStreatNam(String streatNam) {
		this.streatNam = streatNam;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Human2 [hno=" + hno + ", streatNam=" + streatNam + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	}


