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
				Hand.sortHand1();
				Hand.sortHand2();
				DisplayDeck.menu();
				HandValueAssignments.mainButNotReally();
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
	}