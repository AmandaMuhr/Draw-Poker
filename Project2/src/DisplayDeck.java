import java.util.Scanner;

public class DisplayDeck
	{
		public static void menu()
			{
				displayHand1();
				//displayHand2();
			}

		public static void displayHand1()
			{
				System.out.println("");
				System.out.println("Here is your hand:");
				System.out.println("");
				for (Card c : Hand.hand1)
					{
						System.out.println(c.getName() + " of " + c.getSuit() + " (" + c.getColor() + ")");
					}
				System.out.println("");
			}

		public static void displayHand2()
			{
				System.out.println("");
				System.out.println("Here is Player 2's hand");
				System.out.println("");
				for (Card c : Hand.hand2)
					{
						System.out.println(c.getName() + " of " + c.getSuit() + " (" + c.getColor() + ")");
					}
				System.out.println("");
			}
	}