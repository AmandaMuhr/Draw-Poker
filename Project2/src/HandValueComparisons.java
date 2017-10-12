
public class HandValueComparisons
	{
		public static void handValueComparisons()
			{
				if (HandValueAssignments.hand1Value > HandValueAssignments.hand2Value)
					{
						System.out.println("");
						System.out.println("Player 1 wins!");
						// System.out.println("These were Player 2's cards:");
						// DisplayDeck.displayHand2();
					} else if (HandValueAssignments.hand2Value > HandValueAssignments.hand1Value)
					{
						System.out.println("");
						System.out.println("Player 2 wins!");
						// System.out.println("These were Player 1's cards:");
						// DisplayDeck.displayHand1();
					} else if (HandValueAssignments.hand2Value == HandValueAssignments.hand1Value)
					{
						if (HandValueAssignments.valueOfHighestCardHand1 > HandValueAssignments.valueOfHighestCardHand2)
							{
								System.out.println("");
								System.out.println("Player 1 wins!");
								// System.out.println("These were Player 1's
								// cards:");
								// DisplayDeck.displayHand1();
							} else if (HandValueAssignments.valueOfHighestCardHand1 < HandValueAssignments.valueOfHighestCardHand2)
							{
								System.out.println("");
								System.out.println("Player 2 wins!");
							} else if (HandValueAssignments.valueOfHighestCardHand1 == HandValueAssignments.valueOfHighestCardHand2)
							{
								System.out.println("");
								System.out.println("");
								// work on this later; find the highest card to break
								// the tie
							}
					}
				
					else
					{
						if (HandValueAssignments.valueOfHighestCardHand1 > HandValueAssignments.valueOfHighestCardHand2)
							{
								System.out.println("");
								System.out.println("Player 1 wins!");
								System.out.println("These were Player 2's cards:");
								DisplayDeck.displayHand2();
							} else if (HandValueAssignments.valueOfHighestCardHand1 > HandValueAssignments.valueOfHighestCardHand1)
							{
								System.out.println("");
								System.out.println("Player 2 wins!");
								System.out.println("These were Player 1's cards:");
								DisplayDeck.displayHand1();
							} else if (HandValueAssignments.valueOfHighestCardHand1 == HandValueAssignments.valueOfHighestCardHand2)
							{
								System.out.println("");
								System.out.println("It's a tie!");
								// System.out.println("These were Player 2's
								// cards:");
								// DisplayDeck.displayHand2();
							}
					}
			}
	}
