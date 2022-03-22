package Demo;

public class ConstructorDemo {
	
	int a=10;
	int b=10;
	
	{
		System.out.println("nonstat multiline intializer got executed");
	}
	
	public ConstructorDemo() {
	System.out.println("programmer written instruction");	
	}

	public static void main(String[] args) {
		System.out.println("main meyhod");
		
		ConstructorDemo aa=new ConstructorDemo();
		
		
	}

}
