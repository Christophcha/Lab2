import java.util.Random;
import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
		
		Random randomNumber = new Random();
		
		int ageGuess;
		int age = randomNumber.nextInt(100); // gives age a random number 0-100
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is my age?"); //Prompts the user to guess my age
		ageGuess = scan.nextInt();
		
		System.out.print("You guess that I am " + ageGuess + " but I am actually " + age + " years old!"); //Tells users what their guess was and my actual age

	}

}
