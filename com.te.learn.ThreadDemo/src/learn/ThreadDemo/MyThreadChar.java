package learn.ThreadDemo;

public class MyThreadChar implements Runnable {
	
	

	@Override
	public void run() {
				
	for (char  c='a';c<='z';c++) {
		System.out.println(c+"");
	}
		
	}
		
		

}
