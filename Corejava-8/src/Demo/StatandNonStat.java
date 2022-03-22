package Demo;

public class StatandNonStat {
	
	//non-static
	
	//non-static initializer
	
	int i=2;
	
	//non-static multiline initializer
	
	{
		System.out.println("non stat multiline");
	}
	
	//non-static method
	
	public void nonStat() {
		System.out.println("non stat method");
	}

	//static
	
	//static intializer
	
	static int a=1;
	
	//static multline
	
	public class demoStat{
	
	static {
		
		System.out.println("non stat multiline");
	}
	
	//static method

	public static void demoStat() {
		System.out.println("stat method");
	}
	}
	public static void main(String[] args) {
		
		System.out.println("The main class");
		
		StatandNonStat ob = new StatandNonStat(); {
		}
		
		
		System.out.println("-----------");
		
		
	}

}
