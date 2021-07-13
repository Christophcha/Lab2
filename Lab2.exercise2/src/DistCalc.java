import java.util.Scanner;
import java.text.DecimalFormat;

public class DistCalc {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter x1"); //prompts the user to enter x1
		double x1 = scan.nextDouble();
		System.out.println("x1= "+ x1); 
		
		System.out.println("Please enter y1");//prompts the user to enter y1
		double y1 = scan.nextDouble();
		System.out.println("y1= "+ y1); 
		
		System.out.println("Please enter x2");//prompts the user to enter x2
		double x2 = scan.nextDouble();
		System.out.println("x2= "+ x2); 
		
		System.out.println("Please enter y2");//prompts the user to enter y2
		double y2 = scan.nextDouble();
		System.out.println("y2= "+ y2); 
		
		double beforeSqrt = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2); //enters coordinates into equation
		double sqrt = Math.sqrt(beforeSqrt);
		
		DecimalFormat fmt = new DecimalFormat("0.###"); // limits answer to 3 decimals
		
		System.out.print("Distance between your coordinates is: ");
		System.out.println(fmt.format(sqrt));
	
	}

}
