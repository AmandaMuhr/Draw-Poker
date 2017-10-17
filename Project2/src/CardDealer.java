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
				HandValueAssignments.mainButNotReally();
				Hand.sortHand1();
				Hand.sortHand2();
				DisplayDeck.menu();
//					{
//						// HAND 1
//						HandValueAssignments.checkRoyalFlushHand1();
//						HandValueAssignments.findHighestCardHand1();
//						if (HandValueAssignments.hand1Value < 9)
//							{
//								HandValueAssignments.checkStraightFlushHand1();
//							} else if (HandValueAssignments.hand1Value < 8)
//							{
//								HandValueAssignments.checkFourOfAKindHand1();
//							} else if (HandValueAssignments.hand1Value < 7)
//							{
//								HandValueAssignments.checkFullHouseHand1();
//							} else if (HandValueAssignments.hand1Value < 6)
//							{
//								HandValueAssignments.checkFlushHand1();
//							} else if (HandValueAssignments.hand1Value < 5)
//							{
//								HandValueAssignments.checkStraightHand1();
//							} else if (HandValueAssignments.hand1Value < 4)
//							{
//								HandValueAssignments.checkTwoPairHand1();
//							} else if (HandValueAssignments.hand1Value < 2)
//							{
//								HandValueAssignments.checkPairAndThreeOfAKindHand1();
//							}
//						System.out.println("Hand 1 Value = " + HandValueAssignments.hand1Value);
//
//						// HAND 2
//						HandValueAssignments.checkRoyalFlushHand2();
//						HandValueAssignments.findHighestCardHand1();
//						if (HandValueAssignments.hand2Value < 8)
//							{
//								// HandValueAssignments.checkStraightFlushHand2();
//							} else if (HandValueAssignments.hand2Value < 8)
//							{
//								// checkFourOfAKindHand2();
//							} else if (HandValueAssignments.hand2Value < 7)
//							{
//								// checkFullHouseHand2();
//							} else if (HandValueAssignments.hand2Value < 6)
//							{
//								HandValueAssignments.checkFlushHand2();
//							} else if (HandValueAssignments.hand2Value < 5)
//							{
//								HandValueAssignments.checkStraightHand2();
//							} else if (HandValueAssignments.hand2Value < 4)
//							{
//								// HandValueAssignments.checkTwoPairHand2();
//							} else if (HandValueAssignments.hand2Value < 2)
//							{
//								// HandValueAssignments.checkPairAndThreeOfAKindHand2();
//							}
//						System.out.println("Hand 2 Value = " + HandValueAssignments.hand2Value);
//					}
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