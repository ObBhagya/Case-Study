package learn.DemoStrng;

public class StrDemo {

	public static void main(String[] args) {
		
		StringBuffer buffer=new StringBuffer("this is");
		
		buffer.append(" string buffer");
		
		System.out.println(buffer);
		
		
		
		StringBuilder builder=new StringBuilder("this is");
		
		builder.append(" string builder");
		
		System.out.println(builder);
		
		
	}

}
