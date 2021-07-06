import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
		
		int ageGuess;
		int age = 56;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is my age?"); //Prompts the user to guess my age
		ageGuess = scan.nextInt();
		
		if(ageGuess != age) {
			System.out.print("You guessed wrong, I am ");
		
			if(ageGuess < age) {
			System.out.print("older!");
			}
			
			if(ageGuess > age) {
			System.out.print("younger!");
			}
		}
		
		else System.out.print("You guessed correct!"); //if user guesses the correct age
		
	}
}