
public class Sort {
public static void main(String[] args) {
	//ascending order
int [] a= {22,33,45,87,11,2,1};
int temp;
for(int i=0;i<a.length;i++) {
	for (int j=i;j>0;j--) {
		if (a[j]< a[j-1]) {
			temp=a[j];
			a[j]=a[j-1];
			a[j-1]=temp;
		}
	}
	
}

for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);	
}
}
}
