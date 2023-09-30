import java.util.Scanner;

public class MovieDriver_Task2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String input;
		do{
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
			
			keyboard.nextLine();
			System.out.println("Do you want to enter another (y or n)");
			input = keyboard.nextLine();
		}while(input.equals("y") || input.equals("y"));	
	
	System.out.println("Goodbye");
	}	
}


