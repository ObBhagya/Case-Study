package learn.TypeCasting;

public class NarrowWide {

	public static void main(String[] args) {
		
		//narrowing 
		
		double d= 123.987654321;
		byte b=(byte) d;
		System.out.println(d+ " narrowing from "+d );
		
		//widening 
		
		byte bb=12;
		double ll=bb;
		System.out.println(ll+ " widening from " +bb );
		
		
	}

}
