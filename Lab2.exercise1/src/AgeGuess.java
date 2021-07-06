import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
		
		int ageGuess;
		int age = 56;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is my age?"); //Prompts the user to guess my age
		ageGuess = scan.nextInt();
		
		System.out.print("You guess that I am " + ageGuess + " but I am actually " + age + " years old!"); //Tells users what their guess was and my actual age

	}

}
