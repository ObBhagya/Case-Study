package Demo;

public class B extends A{
	private int c=2;
	private int d=1;
	
	public B() {
		super();
			}
	
	public B(int c, int d) {
		this();
		this.c = c;
		this.d = d;
	}
	

	
	
	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	
	

}
