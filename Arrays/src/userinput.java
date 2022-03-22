
public class userinput {

	public static void main(String[] args) {
		String name="My Name is abc";
		name=name.toUpperCase();
		System.out.println(name.length());
		System.out.println(name);
		//System.out.println();
		String[] s=name.split(", 4");
		for(String x:s) {
			System.out.println(x);
			
		}
	}

}
