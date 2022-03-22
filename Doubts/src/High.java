
public class High {
public static void main(String [] args) {
int [] a= {23,56,78,65,43,1000};
int temp=a[0];
for(int i=0;i<a.length;i++)
{
	if(temp<a[i]) {
		temp=a[i];
	}
	}
System.out.println("highest number"+temp);
}
}
