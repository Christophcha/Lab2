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
		
		if(ageGuess != age) {
			System.out.print("You guessed wrong, I am ");
		
			if(ageGuess < age) {
			System.out.print("older! I am " + age + " years old!");
			}
			
			if(ageGuess > age) {
			System.out.print("younger! I am " + age + " years old!");
			}
		}
		
		else System.out.print("You guessed correct!"); //if user guesses the correct age
		
	}
}