package Practise;

import java.util.Comparator;

public class Emply implements Comparator {

	private int eid;
	private String ename;
	private int eage;

	
	
	
	public Emply(int eid, String ename, int eage) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	
	
	
	@Override
	public String toString() {
		return "Emply [eid=" + eid + ", ename=" + ename + ", eage=" + eage + "]";
	}

	@Override
	public int compare(Object o1, Object o2) {
		
		Emply e1=(Emply) o1;
		Emply e2=(Emply) o2;
		
		if(e1.getEage()>e2.getEage())
			return 1;
		else if(e1.eage<e1.getEage())
			return -1;
		
				return 0;
	}

}
