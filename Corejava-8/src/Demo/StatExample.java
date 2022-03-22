package Demo;

public class StatExample {
	
	static {
		//static multiline initializer
		System.out.println("ststic multiliie initilizer");
		StatExample se=new StatExample();
		int a=se.returnMeint();
		System.out.println(a);
		
	}
	
		static int a=10;
		
	public void nonStatiMethod() {
		System.out.println("non static method");
	}
	
	public int returnMeint() {
		return 10;
	}
	
	public static void staticMethod() {
		System.out.println("its a ststic method got executed");
	}

	public static void main(String[] args) {
		
		System.out.println("main method got executed");
		StatExample se=new StatExample();
		
		se.nonStatiMethod();
	}
}
