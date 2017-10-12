import java.util.Scanner;

public class DisplayDeck
	{
		public static void menu()
			{
//				System.out.println("Are you player 1 or player 2?");
//				Scanner userInput = new Scanner(System.in);
//				int answer = userInput.nextInt();
//				if (answer == 1)
//					{
//						displayHand1();
//					}
//				else if (answer == 2)
//					{
//						displayHand2();
//					}
				displayHand1();
				displayHand2();
			}

		public static void displayHand1()
			{
				System.out.println("Player 1, here is your hand:");
				System.out.println("");
				for (Card c : Hand.hand1)
					{
						System.out.println(c.getName() + " of " + c.getSuit() + " (" + c.getColor() + ")");
					}
				System.out.println("");
			}

		public static void displayHand2()
			{
				System.out.println("Player 2, here is your hand:");
				System.out.println("");
				for (Card c : Hand.hand2)
					{
						System.out.println(c.getName() + " of " + c.getSuit() + " (" + c.getColor() + ")");
					}
				System.out.println("");
			}
	}