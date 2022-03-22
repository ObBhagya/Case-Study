import java.util.*;
public class add {
	
	public static void main(String args[]) {
		
		int sum;
		int num1;
		int num2;
		//int i;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number to performe addition");
		System.out.println("enter any  num1");
	    num1=sc.nextInt();
		 System.out.println("enter any  num2");
		num2=sc.nextInt();
		
		sum=num1+num2;


do {
	
	System.out.println("The sum of two numbers " + sum);
	sc.close();
	break;

	}
while(num1>=0&&num2 >=0);

	


	}
	
}
