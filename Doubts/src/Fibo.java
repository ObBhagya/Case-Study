import java.util.Scanner;

public class Fibo {
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int f,s,t;
		int n=0;
		f=0;
		s=1;
		
		
		
		System.out.println("enter the number");
		  n=sc.nextInt();

		  
		  System.out.println(f);
			System.out.println(s);
		  
		for (int i=2;i<n;i++) {
			t=f+s;
			
			f=s;
			s=t;
			
			System.out.println(t);
					}
		
		
	
	
	

	}}
	

