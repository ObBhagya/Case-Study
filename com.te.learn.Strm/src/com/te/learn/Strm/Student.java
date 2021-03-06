package com.te.learn.Strm;

public class Student implements Comparable {

	private int sid;
	private String sname;
	private int sage;

	public Student(int sid, String sname, int sage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student st = (Student) o;
		if (this.sage >st.sage)
			return 1;
		else if (this.sage < st.sage)
			return -1;
		return 0;

	}

}
