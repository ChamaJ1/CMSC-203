import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Movie movieObject = new Movie();
		String again = "y";
		while(again.equals("y"))
		{
			System.out.println("Enter a movie name: ");
			String movieName = input.nextLine();
			movieObject.setTitle(movieName);
			movieObject.getTitle();
			System.out.println("Enter the rating of the movie: ");
			String rating = input.nextLine();
			movieObject.setRating(rating);
			movieObject.getRating();
			System.out.println("Enter the number of tickets sold for this movie: ");
			int ticketSold = input.nextInt();
			movieObject.setSoldTickets(ticketSold);
			System.out.println(movieObject.toString());
			System.out.println("again: " + again);
			System.out.println("Do you want to add another movie? (y or n)");
			again = input.next();
			input.nextLine();
			
		}
	}
		

	

}
	