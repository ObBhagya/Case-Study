package learn.ThreadDemo;

public class ThreadMain {
	
	public static void main() {
		
		System.out.println("main(...)starts");
        
		//Thread th=new Thread(new MyThreadInt);
		
		//th.start();
		
		MyThreadChar char1= new MyThreadChar();
		MyThreadInt int1=new MyThreadInt();
		
		
		
		char1.run();
		int1.run();
		
		System.out.println("main ends");
		
		
	
	}

}
