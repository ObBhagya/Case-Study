package CollectionDem;

public class ArrayListDemo {
	
	private String sname;
	private int sid;
	private int sage;
	
	public ArrayListDemo() {
		super();
		
	}

	public ArrayListDemo(String sname, int sid, int sage) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.sage = sage;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	@Override
	public String toString() {
		return "ArrayListDemo [sname=" + sname + ", sid=" + sid + ", sage=" + sage + "]";
	}
	
	
	
	

}
