import java.util.*;
public class prg {
	public static void main(String[] args) {
		int []a= {10,12,99,22,87,30};
		int temp=0;
		
		Scanner sc=new Scanner(System.in);
		
		
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
		//System.out.println(a[i]);
		
				//System.out.println("enter the number of elements you want to store");
				//int n=sc.nextInt();
				//System.out.println("Enter the array elements");
				//for (i=0;i<n;i++)
					//for(j=i+1;j<n;j++) 
						
				//a[i]=sc.nextInt();
				//for (int i=0;i<a.length;i++) {
					//for(int j=i+1;j<a.length;j++) 
		
		if (a[i]<a[j] )
		{
			
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			
		}
		

		
			}
			
			System.out.println(a[i]);
			
			
			if(a[i]==333|| a[i]==13 || a[i]==31 || a[i]==33 || a[i]==3 || a[i]==30 || a[i]==03) {
				System.out.println("the array contains the number three is present in array: "+a[i]);
				
				
			}
		}
		
	}
	
	
	//System.out.println("fcv");
		

}
