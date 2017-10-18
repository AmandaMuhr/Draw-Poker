import java.util.Scanner;

public class Betting
	{
		static int money = 100;
		static int wager;
		
		public static void betting()
			{
				System.out.println("You have " + money + "; how much would you like to bet on your hand?");
				Scanner userInput = new Scanner(System.in);
				int wager = userInput.nextInt();
				
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
				else if (wager < money)
					{
						money = money - wager;
						System.out.println("All right! You bet $" + wager + " and you have $" + money + " left.");
					}
				else
					{
						System.out.println("Error...");
						betting();
					}
			}
	}
