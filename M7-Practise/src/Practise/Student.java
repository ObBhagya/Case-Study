package Practise;

public class Student implements Comparable {

	private int sid;
	private int sage;
	private String name;

	public Student(int sid, int sage, String name) {
		super();
		this.sid = sid;
		this.sage = sage;
		this.name = name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sage=" + sage + ", name=" + name + "]";
	}

//	@Override
//	public int compareTo(Object o) {
//
//		Student s = (Student) o;
//		if (this.sage < s.sage)
//			return 1;
//		else if (this.sage > s.sage)
//			return -1;
//
//		return 0;
//	}


	


@Override
public int compareTo(Object o) {
	Student s = (Student) o;
	if (this.sage < s.sage)
		return 1;
	else if (this.sage > s.sage)
		return -1;		
	return 0;	
}

}
