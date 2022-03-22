package learn.comprble;

import java.util.Comparator;

public class Employee implements Comparator {

	private int eid;
	private String name;
	private int age;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String name, int age, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compare(Object o1, Object o2) {

		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;

		if (e1.getAge() > e2.getAge())
			return 1;
		else if (e1.getAge() > e2.getAge())

			return -1;

		return 0;
	}

}
