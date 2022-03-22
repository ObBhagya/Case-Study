package Demo;

public class App1 {
	/* this is normal class */

	public static void main(String[] args) {
		System.out.println("hello");

		int i = 10;
		float f = 12.123f;
		long l = 123456l;
		double d = 12.454d;

		double res = i + f + l + d;

		System.out.println("result--" + res);

		int d1 = 2;
		double i1 = 12.123;

		double sum = d1 + i1;

		System.out.println("add--" + sum);

		char c1 = 'a';
		char c2 = 'b';

		char c = (char) (c1 * c2);

		int cz = (char) (c1 + c2);

		int cz1 = (char) (c1 * c2);

		System.out.println("ress-->" + c);

		System.out.println("val--" + cz);

		System.out.println("val--" + cz1);

		char c1A = 'A';
		char c2B = 'B';

		char rs = (char) (c1A + c2B);
		System.out.println("rs-> " + rs);

		int x = 10;
		int y = 20;

		int preincr = ++x;
		System.out.println("x pre-increament" + x);

		int postincr = ++x;
				System.out.println("x post-incr" +x);
				
				int preddec=--x;
				System.out.println("x pre-dec" +x);
				
				int preinc=x--;
				System.out.println("x post-dec"+x);

		int q = 10;

		boolean rez = (q >= 10) ? true : false;

		if (rez) {
			System.out.println(q + "is greater/equal to 10");
		} else {
			System.out.println(q + "is less than 10");

		}

	}

}
