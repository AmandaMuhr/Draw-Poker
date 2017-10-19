import java.util.Scanner;

public class Betting
	{
		public static Scanner userInput = new Scanner(System.in);
		public static int wager;
		public static int money = 100;
		
		public static void betting()
			{
				System.out.println("You have $" + Betting.money + "; how much would you like to bet on your hand?");
				wager = userInput.nextInt();
				
				if (wager <= 0)
					{
						System.out.println("Sorry, this is not a valid input...");
						betting();
					}
				else if (wager > money)
					{
						System.out.println("Sorry, this is more money than you have!");
						betting();
					}
				else if (wager < Betting.money)
					{
						System.out.println("All right! You bet $" + wager + ".");
					}
				else
					{
						System.out.println("Error...");
						betting();
					}
			}
	}
