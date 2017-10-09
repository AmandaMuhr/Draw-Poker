import java.util.Collections;
import java.util.Scanner;

public class CardDealer
	{
		static int randomNumber = (int) (Math.random() * 50);

		public static void main(String[] args)
			{
				DeckCreator.fillCardDeck();
				shuffleCards();
				dealCards();
				printPlayer1Cards();
				printPlayer2Cards();
				HandValueComparisons.handValueComparisons();
			}

		public static void shuffleCards()
			{
				Collections.shuffle(DeckCreator.deck);
			}

		public static void dealCards()
			{
				for (int i = 0; i < 10; i++)
					{
						if (i % 2 == 0)
							{
								Hand.hand1.add(DeckCreator.deck.get(0));
								DeckCreator.deck.remove(0);
							} else if (i % 2 == 1)
							{
								Hand.hand2.add(DeckCreator.deck.get(0));
								DeckCreator.deck.remove(0);
							} else
							{
								System.out.println("That's a problem...");
							}
					}
			}

		public static void printPlayer1Cards()
			{
				System.out.println("Player 1, here is your hand:");
				System.out.println("");
				for (int a = 0; a < Hand.hand1.size(); a++)
					{
						System.out.println( Hand.hand1.get(a).getName() + " of "
								+ Hand.hand1.get(a).getSuit() + " (" + Hand.hand1.get(a).getColor() + ")");
					}
			}

		public static void printPlayer2Cards()
			{
				System.out.println("");
				System.out.println("Player 2, here is your hand:");
				System.out.println("");
				for (int a = 0; a < Hand.hand2.size(); a++)
					{
						System.out.println(Hand.hand2.get(a).getName() + " of "
								+ Hand.hand2.get(a).getSuit() + " (" + Hand.hand2.get(a).getColor() + ")");
					}
			}
	}