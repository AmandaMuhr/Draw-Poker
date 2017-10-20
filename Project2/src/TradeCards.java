import java.util.Scanner;

public class TradeCards
	{
		public static Scanner userInput2 = new Scanner(System.in);
		
		
		public static void tradeCards()
			{
				System.out.println("Would you like to trade any cards?");
				System.out.println("Look at your hand and type a number from 1 to 5 to select a card to trade. If you do not want to trade a card, please type 6.");
				int cardTrade = userInput2.nextInt();
			}
	}
