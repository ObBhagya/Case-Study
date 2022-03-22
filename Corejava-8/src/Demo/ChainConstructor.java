package Demo;

import com.sun.net.httpserver.Filter.Chain;

public class ChainConstructor {
	
	int a=10;
	int b=10;
	
	//nonststic multiline intilizer
	{
		System.out.println("non ststic multine initializer got executed");
	}

	public ChainConstructor() {
		System.out.println("written in ChainConst()");
	}
	
	public ChainConstructor(int aa) {
		this();
		this.a=aa;
		System.out.println("written in ChainConstructor(int a)");
	}
	
	public ChainConstructor(int a, int b) {
		this(a);
		this.b=b;
		System.out.println("ChainConstructor(int a.int b)");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method");
		
		ChainConstructor cc=new ChainConstructor(20,10);
		System.out.println(cc.a);
		System.out.println(cc.b);
		
		
	}

}
