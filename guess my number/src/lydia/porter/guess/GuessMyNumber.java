package lydia.porter.guess;
import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

	public GuessMyNumber() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int guess; // if you declare it here you can use it anywhere throughout your code :)
		
		// System.out.println(random.nextInt(10)+1); // range (10) + 1 does 1-10
		
		//picking the random number
		int the_number = random.nextInt(10)+1; // comparing everything else to this number
		
		System.out.println("Welcome to the Guess My Number game!");
		System.out.println("I'm thinking of a number between 1 and 10.");
		System.out.println("You have 3 guesses to get the number.");
		System.out.println("Good luck!");
		System.out.println();
		
		System.out.println("Pick a number between 1 and 10 and press enter:");
		if  (input.hasNextInt()) {
			guess = input.nextInt();//only one possible outcome out of the three below:
			 if (guess == the_number) {
				 System.out.println("You got it! Great job!"); // if the number matches, it will say true
			 }
			 else if (guess < the_number) {
				 System.out.println("Guess higher.");
			 } // if none of the above are false, check this one below:
			 else {
				 System.out.println("Guess lower.");
			 }
			 
		}
		else {
			System.out.println("Not a good value. You lose a guess.");
			input.nextLine();
		}
		
		//2nd guess
		System.out.println("Pick a number between 1 and 10 and press enter:");
		if  (input.hasNextInt()) {
			guess = input.nextInt();//only one possible outcome out of the three below:
			 if (guess == the_number) {
				 System.out.println("You got it! Great job!"); // if the number matches, it will say true
			 }
			 else if (guess < the_number) {
				 System.out.println("Guess higher.");
			 } // if none of the above are false, check this one below:
			 else {
				 System.out.println("Guess lower.");
			 }
			 
		}
		else {
			System.out.println("Not a good value. You lose a guess.");
		}
		
		
		//3rd
		System.out.println("Pick a number between 1 and 10 and press enter:");
		if  (input.hasNextInt()) {
			guess = input.nextInt();//only one possible outcome out of the three below:
			 if (guess == the_number) {
				 System.out.println("You got it! Great job!"); // if the number matches, it will say true
			 }
			 else if (guess < the_number) {
				 System.out.println("Guess higher.");
			 } // if none of the above are false, check this one below:
			 else {
				 System.out.println("Guess lower.");
			 }
			 
		}
		else {
			System.out.println("Not a good value. You lose a guess.");
		}
		
		input.close();
	}

	public static void main(String[] args) {
		new GuessMyNumber();

	}

}
