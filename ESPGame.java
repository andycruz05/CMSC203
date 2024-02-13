import java.util.Scanner;
import java.util.Random;

public class ESPGame
{
	public static void main (String[] args)
	{
		String name, ID, desc, date;
		Scanner stdin = new Scanner (System.in);
		System.out.print("What is your name? ");
		name = stdin.nextLine();
		System.out.print("What is your MC ID? ");
		ID = stdin.nextLine();
		System.out.print("Describe yourself: ");
		desc = stdin.nextLine();
		System.out.print("Enter due date: ");
		date = stdin.nextLine();
		
		int correctGuesses = 0;
		
		Random random = new Random();
		
		for (int i = 0; i < 11; i++)
		{
           
            String selectedColor;
            int num = random.nextInt(7);
            
            switch (num)
            {
                case 0:
                    selectedColor = "Red";
                    break;
                case 1:
                    selectedColor = "Green";
                    break;
                case 2:
                    selectedColor = "Blue";
                    break;
                case 3:
                    selectedColor = "Orange";
                    break;
                case 4:
                    selectedColor = "Yellow";
                    break;
                case 5:
                    selectedColor = "Purple";
                    break;
                default: // For case 6
                    selectedColor = "Pink";
                    break;
            }
            
            String Guess;
            System.out.println("I am thinking of a color.");
    		System.out.println("Is it Red, Orange, Yellow, Green, Blue, Purple, or Pink?");
    		System.out.println("Enter your guess: ");
    		Guess = stdin.nextLine();
    		System.out.println("The selected color was: " + selectedColor);
            
            if (Guess.equalsIgnoreCase(selectedColor))
            {
                correctGuesses++;
            }
        }

   
        System.out.println("You guessed " + correctGuesses + " out of 11 colors correctly.");

        // Display user's information
        System.out.println("Student Name: " + name);
        System.out.println("User Description: " + desc);
        System.out.println("Due Date: " + date);

        
    }
}