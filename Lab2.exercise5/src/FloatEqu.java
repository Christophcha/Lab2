
public class FloatEqu {

	public static void main(String[] args) {
		
		
		double x = (1.0/10) * (1.0/10);
		double y = (1.0/100);
		
		System.out.println(x);
		System.out.println(y);
		
		if (x == y) {
			System.out.println("EQUAL"); 
		}
		if (Math.abs(x - y) < .00001) { 	//sets a tolerance between x and y
			 System.out.println ("Essentially equal");
		}
		else {
			System.out.println("NOT EQUAL");
		}
	}
}

