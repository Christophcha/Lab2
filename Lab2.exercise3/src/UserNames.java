import java.util.Random;
import java.util.Scanner;

public class UserNames {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random randomNumber = new Random();
		
		String firstName;
		String lastName;
		String username;
		int range = 10 + randomNumber.nextInt(99-10); // gives randomNumber a range of 10-99
		
		System.out.println("What is your first name?"); // prompts user to enter first name
		firstName = scan.nextLine();
		
		System.out.println("What is your last name?"); // prompts user to enter last name
		lastName = scan.nextLine();
		
		username = lastName.substring(0,4) + firstName.substring(0,1) + range; //makes the username with the specifications
		
		System.out.println("Your username is : " + username); //displays username to user
	}

}
