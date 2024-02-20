import java.util.Scanner;

public class MovieDriver
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        Movie movie = new Movie();
        String choice;
        do 
        {
            System.out.println("Enter the name of a movie");
            movie.setTitle(sc.nextLine());
            System.out.println("Enter the rating of the movie");
            movie.setRating(sc.nextLine());
            System.out.println("Enter the number of tickets sold for this movie");
            movie.setSoldTickets(sc.nextInt());
            sc.nextLine();
            System.out.println(movie);
            System.out.println("Do you want to enter another? (y or n)");
            choice = sc.nextLine();
        } 
        while(choice.equals("y"));
        System.out.println("Goodbye");
		
	}

}