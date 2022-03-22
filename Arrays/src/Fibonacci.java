import java.util.*;
public class Fibonacci {
	public static void main(String[] args)
	{
		int n1=0,n2=1,n3;
		System.out.println("Enter the number of terms :");
		Scanner sc =  new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Fibonacci Series"+n1+ " "+n2);
	
		for(int i=2;i<n;i++)
		{
		n3=n1+n2;
		System.out.println(" "+n3);
		n1=n2;
		n2=n3;
		}
		sc.close();
	}
	

}
