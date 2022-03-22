package learn.PrePostIncrDec;

public class PostPreID {

	public static void main(String[] args) {
	
		int a=10;
		int b=20;
		//11+20
		int res= ++a + a++;
		System.out.println("pre and post incr " +res);
		
		//9+20
		int res_= --a - a--;
		System.out.println("pre and post dec " +res_);
		//10+21
		int rest= a++ + ++b;
		System.out.println("double pre and post incr " +rest);
		
		
  
	}

}
