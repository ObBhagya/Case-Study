import java.util.HashSet;
import java.util.Set;

public class StrDuplication {
	public static void main(String[] args) {
		
		String str="abbacd";
	char []c= str.toCharArray();
	StringBuilder sb=new StringBuilder();
	
	
	Set st=new HashSet();
	for(char ct:c) {
	if(!st.contains(c)) {
		st.add(c);
	    sb.append(c);
	}
	}
	    
	    System.out.println("duplicates removed"+sb.toString());
	    
	    }
}

