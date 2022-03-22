package methodoverriding;

public class demo2 extends demo{
	public void m2() {
		
		System.out.println("from demo2");
	
		super.m1();
		
	}
	
public static void m2() {
		
		System.out.println("from demo2");
}
	
}
	



