
package Demo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		boolean exit = false;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("====calculator=====");
			System.out.println("enter the option to calculate");
			System.out.println("1.Add");
			System.out.println("2.Substrat");
			System.out.println("3.Multiplication");
			System.out.println("4.divide");
			System.out.println("5. Exit");

			int option = sc.nextInt();

			switch (option) {

			case 1: {
				System.out.println("enter the first num");
				int a = sc.nextInt();
				System.out.println("enter the second nu");
				int b = sc.nextInt();
				int sum = Calcu.add(a, b);
				System.out.println("res" + sum);

			}

			case 2: {
				System.out.println("enter the first num");
				int a = sc.nextInt();
				System.out.println("enter the second nu");
				int b = sc.nextInt();
				int sub = Calcu.sub(a, b);
				System.out.println("res" + sub);
			}

			case 3: {
				System.out.println("enter the first num");
				int a = sc.nextInt();
				System.out.println("enter the second nu");
				int b = sc.nextInt();
				int mul = Calcu.mul(a, b);
				System.out.println("res" + mul);
			}

			case 4: {
				System.out.println("enter the first num");
				int a = sc.nextInt();
				System.out.println("enter the second nu");
				int b = sc.nextInt();
				int div = Calcu.div(a, b);
				System.out.println("res" + div);

			}
			case 5: {
				System.out.println("System exited");
				System.exit(0);

			}

			default: {
				System.out.println("optin invalid");
			}

			}
		}

		while (!exit);

	}

}
