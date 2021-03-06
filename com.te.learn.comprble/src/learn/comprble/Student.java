package learn.comprble;

public class Student implements Comparable {

	private int sid;
	private String name;
	private int age;
	private double percentage;
	
	
	
	
	public Student(int sid, String name, int age, double percentage) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}




	public int getSid() {
		return sid;
	}




	public void setSid(int sid) {
		this.sid = sid;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public double getPercentage() {
		return percentage;
	}




	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}




	@Override
	public int compareTo(Object o) {
		Student s=(Student) o;
		if (this.age<s.age) 
			return 1;
		else if(this.age>s.age)
		
			return -1;
		return 0;
	
	}




	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", percentage=" + percentage + "]";
	}
	
}
	
	

