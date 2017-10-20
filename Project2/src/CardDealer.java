import java.util.Collections;
import java.util.Scanner;

public class CardDealer
	{
		static int randomNumber = (int) (Math.random() * 50);
		static boolean stillPlaying = true;

		public static void main(String[] args)
			{
				DeckCreator.fillCardDeck();
				while (stillPlaying)
					{
						//ROUND 1
						shuffleCards();
						dealCards();
						Hand.sortHand1();
						Hand.sortHand2();
						HandValueAssignments.mainButNotReally();
						DisplayDeck.menu();
						Betting.compBetting();
						if (!Betting.compFold)
							{
						Betting.playerBetting();
							}
						if (Betting.playerBet == 0)
							{
								HandValueComparisons.doYouWantToPlayAgain();
								stillPlaying = true;
							}
						else if (Betting.compFold)
							{

								Betting.calculatePot();
								stillPlaying = true;
							}
						else
							{
								Betting.calculatePot();
								HandValueComparisons.handValueComparisons();
								stillPlaying = true;
							}
						
						// ROUND 2
						TradeCards.tradeCards();
						Hand.sortHand1();
						Hand.sortHand2();
						HandValueAssignments.mainButNotReally();
						DisplayDeck.menu();
						Betting.compBetting();
						if (!Betting.compFold)
							{
								Betting.playerBetting();
							}
						if (Betting.playerBet == 0)
							{
								HandValueComparisons.doYouWantToPlayAgain();
								stillPlaying = true;
							} else if (Betting.compFold)
							{

								Betting.calculatePot();
								stillPlaying = true;
							} else
							{
								Betting.calculatePot();
								HandValueComparisons.handValueComparisons();
								stillPlaying = true;
							}
						
					}
				System.exit(0);
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