import java.util.Scanner;

public class NumDisplay {

	public static void main(String[] args) {
		
	int number;
	Scanner scan = new Scanner (System.in);
	
	System.out.print("Enter a number between 0-9: "); //prompts user to enter a number
	number = scan.nextByte();
	
	switch(number) {
		case 0:
			System.out.print("Zero");	
			break;
		case 1:
			System.out.print("One");
			break;
		case 2:
			System.out.print("Two");
			break;
		case 3:
			System.out.print("Three");
			break;
		case 4:
			System.out.print("Four");
			break;
		case 5:
			System.out.print("Five");
			break;
		case 6:
			System.out.print("Six");
			break;
		case 7:
			System.out.print("Seven");
			break;
		case 8:
			System.out.print("Eight");
			break;
		case 9:
			System.out.print("Nine");
			break;
		default:
			System.out.print("You have entered a number that isnt between 0-9, try again."); //if user does not enter the correct number
			break;
	}
	}

}
