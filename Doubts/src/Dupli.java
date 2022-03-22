import java.util.HashSet;
import java.util.Set;

public class Dupli {

	public static void main(String[] args) {
		
			     String stringWithDuplicates = "afsjeadrffafvgdefeverhfgberAAad";
			     char[] characters = stringWithDuplicates.toCharArray();
			     Set set=new HashSet();
			     StringBuilder sb = new StringBuilder();
			     System.out.println("String with duplicates : " + stringWithDuplicates);
			     for (char c : characters) {
			        if (!set.contains(c)) {
			          set.add(c);
			          sb.append(c);
			        }
			     }
			     System.out.println("String after duplicates removed : " + sb.toString());
			   }
			
	}


