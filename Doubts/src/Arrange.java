
public class Arrange {
	public static void main(String[] args) {
		//ascending order
	int [] a= {22,33,45,87,11,2,1};
	int temp=0;
	for(int i=0;i<a.length;i++) {
		for (int j=i+1;j<a.length;j++) {
			
			if (a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
		
		System.out.println(a[i]);
			
		}
}
}
