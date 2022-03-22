package Demo;

public class DemInherit {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.getC());
		System.out.println(b.getD());
		System.out.println(b.getB());
		System.out.println(b.getA());

		A a = new B(); // upcasting
		System.out.println(a.getA());
		System.out.println(a.getB());

		// B bb=new A();
		// System.out.println(bbb.getA());
		// System.out.println(bbb.getB());
		// System.out.println(bbb.getC());
		// System.out.println(bbb.getD());
		//
		A aa = new B();
		B bbb = (B) aa; // B bbb=new B();
		System.out.println(bbb.getA());
		System.out.println(bbb.getB());
		System.out.println(bbb.getC());
		System.out.println(bbb.getD());

		C c = (C) aa;

	}

}
