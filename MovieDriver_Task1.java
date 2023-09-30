import java.util.Scanner;
public class MovieDriver_Task1 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Movie m1 = new Movie();
		
		System.out.println("What is the title of the movie: ");
		String movieName = keyboard.nextLine();
		
		m1.setTitle(movieName);
		
		System.out.println("What is the ratings for this movie: ");
		String movieRating = keyboard.nextLine();
		
		m1.setRating(movieRating);
		
		System.out.println("How many tickets where sold: ");
		int tickets = keyboard.nextInt(); 
		
		m1.setSoldTickets(tickets);
		
		System.out.println(m1);
	}

}
