
public class PalindromeStr {

	public static void main(String[] args) {
		String s="abc";
		
		int i=0,j=s.length()-1;
	
	
		while(i<j) {
			
			if(s.charAt(i)!=s.charAt(j)) {
				System.out.println("not pallindrome ");
				System.exit(0);
				//break;
				
			}
			
			i++;
			j--;
				
				
		}
		
			
			
			System.out.println("pallindrome "+s);
		
		
	
	}
		
			
		
		
	
	
}